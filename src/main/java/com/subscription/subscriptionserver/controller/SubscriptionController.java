package com.subscription.subscriptionserver.controller;

import com.subscription.subscriptionserver.exceptions.ResourceException;
import com.subscription.subscriptionserver.interceptors.JwtInterceptors;
import com.subscription.subscriptionserver.service.SubscriptionService;
import com.subscriptionserver.proto.CreateSubscriptionRequest;
import com.subscriptionserver.proto.DeleteSubscriptionRequest;
import com.subscriptionserver.proto.DeleteSubscriptionResponse;
import com.subscriptionserver.proto.ListSubscriptionRequest;
import com.subscriptionserver.proto.ListSubscriptionResponse;
import com.subscriptionserver.proto.RenewSubscriptionRequest;
import com.subscriptionserver.proto.RenewSubscriptionResponse;
import com.subscriptionserver.proto.Subscription;
import com.subscriptionserver.proto.SubscriptionServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The type Subscription controller.
 */
@Log4j2
@GRpcService(interceptors = JwtInterceptors.class)
public class SubscriptionController extends
    SubscriptionServiceGrpc.SubscriptionServiceImplBase {
  /**
   * The Subscription service.
   */
  @Autowired
  private SubscriptionService subscriptionService;

  @Override
  public void createSubscription(final CreateSubscriptionRequest request,
                                 final StreamObserver<Subscription> responseObserver) {
    try {
      responseObserver.onNext(subscriptionService.createSubscription(request));
      responseObserver.onCompleted();
    } catch (ResourceException e) {
      responseObserver.onError(Status.ABORTED.withDescription(e.getMessage()).asRuntimeException());
    } catch (Exception e) {
      log.error(e);
      responseObserver.onError(Status.INTERNAL.asRuntimeException());
    }
  }

  @Override
  public void listSubscription(final ListSubscriptionRequest request,
                               final StreamObserver<ListSubscriptionResponse> responseObserver) {
    try {
      responseObserver.onNext(subscriptionService.listSubscription(request));
      responseObserver.onCompleted();
    } catch (ResourceException e) {
      responseObserver.onError(Status.ABORTED.withDescription(e.getMessage()).asRuntimeException());
    } catch (Exception e) {
      log.error(e);
      responseObserver.onError(Status.INTERNAL.asRuntimeException());
    }
  }

  @Override
  public void deleteSubscription(final DeleteSubscriptionRequest request,
                                 final StreamObserver<DeleteSubscriptionResponse> responseObserver) {
    try {
      responseObserver.onNext(subscriptionService.deleteSubscription(request));
      responseObserver.onCompleted();
    } catch (ResourceException e) {
      responseObserver.onError(Status.ABORTED.withDescription(e.getMessage()).asRuntimeException());
    } catch (Exception e) {
      log.error(e);
      responseObserver.onError(Status.INTERNAL.asRuntimeException());
    }
  }

  @Override
  public void renewSubscription(final RenewSubscriptionRequest request,
                                final StreamObserver<RenewSubscriptionResponse> responseObserver) {
    try {
      responseObserver.onNext(subscriptionService.renewSubscription(request));
      responseObserver.onCompleted();
    } catch (ResourceException e) {
      responseObserver.onError(Status.ABORTED.withDescription(e.getMessage()).asRuntimeException());
    } catch (Exception e) {
      log.error(e);
      responseObserver.onError(Status.INTERNAL.asRuntimeException());
    }
  }
}
