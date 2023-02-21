package com.subscription.subscriptionserver.controller;

import com.subscription.subscriptionserver.service.NewsletterService;
import com.subscriptionserver.proto.CreateNewsletterRequest;
import com.subscriptionserver.proto.ListNewsletterRequest;
import com.subscriptionserver.proto.ListNewsletterResponse;
import com.subscriptionserver.proto.NewsletterDetails;
import com.subscriptionserver.proto.NewsletterServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The type Newsletter controller.
 */
@Log4j2
@GRpcService
public class NewsletterController extends
    NewsletterServiceGrpc.NewsletterServiceImplBase {
  /**
   * The Newsletter service.
   */
  @Autowired
  private NewsletterService newsletterService;

  @Override
  public void createNewsletter(final CreateNewsletterRequest request,
                               final StreamObserver<NewsletterDetails> responseObserver) {
    responseObserver.onNext(newsletterService.createNewsletter(request));
    responseObserver.onCompleted();
  }

  @Override
  public void listNewsletter(final ListNewsletterRequest request,
                             final StreamObserver<ListNewsletterResponse> responseObserver) {
    responseObserver.onNext(newsletterService.listNewsletter());
    responseObserver.onCompleted();
  }
}
