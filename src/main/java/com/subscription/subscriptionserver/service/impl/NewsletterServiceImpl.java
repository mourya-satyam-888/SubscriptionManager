package com.subscription.subscriptionserver.service.impl;

import com.subscription.subscriptionserver.entity.Newsletter;
import com.subscription.subscriptionserver.repository.NewsletterRepo;
import com.subscription.subscriptionserver.service.NewsletterService;
import com.subscriptionserver.proto.CreateNewsletterRequest;
import com.subscriptionserver.proto.ListNewsletterResponse;
import com.subscriptionserver.proto.NewsletterDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Newsletter service.
 */
@Service
public class NewsletterServiceImpl implements NewsletterService {
  /**
   * The Newsletter repo.
   */
  @Autowired
  private NewsletterRepo newsletterRepo;

  @Override
  public NewsletterDetails createNewsletter(CreateNewsletterRequest request) {
    Newsletter newsletter = newsletterDetailsToNewsletter(request.getNewsletter());
    newsletterRepo.save(newsletter);
    return newsletterToNewsletterDetails(newsletter);
  }

  @Override
  public ListNewsletterResponse listNewsletter() {
    List<Newsletter> newsletters = newsletterRepo.findAll();
    List<NewsletterDetails> newsletterDetailsList = newsletters.stream()
        .map(this::newsletterToNewsletterDetails).collect(Collectors.toList());
    return ListNewsletterResponse.newBuilder().addAllNewsletter(newsletterDetailsList).build();
  }

  /**
   * Newsletter details to newsletter newsletter.
   *
   * @param newsletterDetails the newsletter details
   * @return the newsletter
   */
  public Newsletter newsletterDetailsToNewsletter(final NewsletterDetails newsletterDetails) {
    return Newsletter.builder()
        .title(newsletterDetails.getTitle())
        .genre(newsletterDetails.getGenre())
        .price(newsletterDetails.getPrice())
        .validity(newsletterDetails.getValidity())
        .build();
  }

  /**
   * Newsletter to newsletter details newsletter details.
   *
   * @param newsletter the newsletter
   * @return the newsletter details
   */
  public NewsletterDetails newsletterToNewsletterDetails(final Newsletter newsletter) {
    return NewsletterDetails.newBuilder().setId(newsletter.getId())
        .setId(newsletter.getId())
        .setTitle(newsletter.getTitle())
        .setGenre(newsletter.getGenre())
        .setPrice(newsletter.getPrice())
        .setValidity(newsletter.getValidity()).build();
  }
}
