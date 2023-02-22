package com.subscription.subscriptionserver.service.impl;

import com.subscription.subscriptionserver.constants.ExceptionMessageConstants;
import com.subscription.subscriptionserver.entity.Newsletter;
import com.subscription.subscriptionserver.entity.Subscription;
import com.subscription.subscriptionserver.exceptions.ResourceException;
import com.subscription.subscriptionserver.kafka.KafkaProducerConfig;
import com.subscription.subscriptionserver.repository.NewsletterRepo;
import com.subscription.subscriptionserver.repository.SubscriptionRepo;
import com.subscription.subscriptionserver.service.SubscriptionService;
import com.subscription.subscriptionserver.util.GrpcUtils;
import com.subscriptionserver.proto.CreateSubscriptionRequest;
import com.subscriptionserver.proto.DeleteSubscriptionRequest;
import com.subscriptionserver.proto.DeleteSubscriptionResponse;
import com.subscriptionserver.proto.KafkaMessage;
import com.subscriptionserver.proto.ListSubscriptionRequest;
import com.subscriptionserver.proto.ListSubscriptionResponse;
import com.subscriptionserver.proto.RenewSubscriptionRequest;
import com.subscriptionserver.proto.RenewSubscriptionResponse;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Subscription service.
 */
@Log4j2
@Service
public class SubscriptionServiceImpl implements SubscriptionService {
  /**
   * The Grpc utils.
   */
  @Autowired
  private GrpcUtils grpcUtils;
  /**
   * The Subscription repo.
   */
  @Autowired
  private SubscriptionRepo subscriptionRepo;
  /**
   * The Newsletter repo.
   */
  @Autowired
  private NewsletterRepo newsletterRepo;
  @Autowired
  private KafkaProducerConfig kafkaProducer;

  @Override
  public com.subscriptionserver.proto.Subscription createSubscription(
      CreateSubscriptionRequest request) {
    final String username = getUsername();
    final Newsletter newsletter = newsletterRepo
        .findById(request.getSubscription().getNewsletterId())
        .orElseThrow(() -> new ResourceException(ExceptionMessageConstants.NEWSLETTER_NOT_FOUND));
    if (subscriptionRepo.existsByUsernameAndNewsletter(username, newsletter)) {
      throw new ResourceException(ExceptionMessageConstants.SUBSCRIPTION_ALREADY_EXISTS);
    }
    Subscription subscription = Subscription.builder()
        .username(username)
        .validity(Date.valueOf(LocalDate.now().plusDays(newsletter.getValidity())))
        .newsletter(newsletter)
        .build();
    newsletter.getSubscriptions().add(subscription);
    newsletterRepo.save(newsletter);
    subscriptionRepo.save(subscription);
    kafkaProducer.send(KafkaMessage.newBuilder().setContent(subscription.getId())
        .setReceiver(username).build());
    return com.subscriptionserver.proto.Subscription.newBuilder()
        .setId(subscription.getId())
        .setUsername(subscription.getUsername())
        .setNewsletterId(subscription.getNewsletter().getId())
        .setValidityDate(subscription.getValidity().toString())
        .build();
  }

  @Override
  public ListSubscriptionResponse listSubscription(ListSubscriptionRequest request) {
    final String username = getUsername();
    List<Subscription> subscriptions = subscriptionRepo.findAllByUsername(username);
    List<com.subscriptionserver.proto.Subscription> subscriptionsProto = subscriptions
        .stream().map(s -> com.subscriptionserver.proto.Subscription.newBuilder()
            .setId(s.getId())
            .setUsername(s.getUsername())
            .setNewsletterId(s.getNewsletter().getId())
            .setValidityDate(s.getValidity().toString()).build()
        ).toList();
//    kafkaProducer.send(KafkaMessage.newBuilder().setContent("DummyMessage")
//        .setReceiver("satyam").build());
    return ListSubscriptionResponse.newBuilder()
        .addAllSubscription(subscriptionsProto).build();
  }

  @Override
  public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request) {
    Subscription subscription = subscriptionRepo.findById(request.getSubscriptionId())
        .orElseThrow(() -> new ResourceException(ExceptionMessageConstants.SUBSCRIPTION_NOT_FOUND));
    if (!getUsername().equals(subscription.getUsername())) {
      throw new ResourceException(ExceptionMessageConstants.SUBSCRIPTION_NOT_FOUND);
    }
    Newsletter newsletter = subscription.getNewsletter();
    newsletter.getSubscriptions().remove(subscription);
    newsletterRepo.save(newsletter);
    subscriptionRepo.delete(subscription);
    return DeleteSubscriptionResponse.newBuilder().build();
  }

  @Override
  public RenewSubscriptionResponse renewSubscription(RenewSubscriptionRequest request) {
    Subscription subscription = subscriptionRepo.findById(request.getSubscriptionId())
        .orElseThrow(() -> new ResourceException(ExceptionMessageConstants.SUBSCRIPTION_NOT_FOUND));
    if (!getUsername().equals(subscription.getUsername())) {
      throw new ResourceException(ExceptionMessageConstants.SUBSCRIPTION_NOT_FOUND);
    }
    subscription.setValidity(Date.valueOf(subscription.getValidity()
        .toLocalDate().plusDays(subscription.getNewsletter().getValidity())));
    subscriptionRepo.save(subscription);
    return RenewSubscriptionResponse.newBuilder()
        .setSubscription(com.subscriptionserver.proto.Subscription.newBuilder()
            .setId(subscription.getId())
            .setUsername(subscription.getUsername())
            .setNewsletterId(subscription.getNewsletter().getId())
            .setValidityDate(subscription.getValidity().toString())
            .build()).build();
  }

  /**
   * Gets username.
   *
   * @return the username
   */
  public String getUsername() {
    final Optional<String> usernameOptional = grpcUtils.getUsername();
    if (!usernameOptional.isPresent()) {
      throw new ResourceException(ExceptionMessageConstants.USER_NOT_FOUND);
    }
    return usernameOptional.get();
  }
}
