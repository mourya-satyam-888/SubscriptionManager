package com.subscription.subscriptionserver.service;

import com.subscriptionserver.proto.CreateSubscriptionRequest;
import com.subscriptionserver.proto.DeleteSubscriptionRequest;
import com.subscriptionserver.proto.DeleteSubscriptionResponse;
import com.subscriptionserver.proto.ListSubscriptionRequest;
import com.subscriptionserver.proto.ListSubscriptionResponse;
import com.subscriptionserver.proto.RenewSubscriptionRequest;
import com.subscriptionserver.proto.RenewSubscriptionResponse;
import com.subscriptionserver.proto.Subscription;

/**
 * The interface Subscription service.
 */
public interface SubscriptionService {
  /**
   * Create subscription subscription.
   *
   * @param request the request
   * @return the subscription
   */
  Subscription createSubscription(CreateSubscriptionRequest request);

  /**
   * List subscription list subscription response.
   *
   * @param request the request
   * @return the list subscription response
   */
  ListSubscriptionResponse listSubscription(ListSubscriptionRequest request);

  /**
   * Delete subscription delete subscription response.
   *
   * @param request the request
   * @return the delete subscription response
   */
  DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request);

  /**
   * Renew subscription renew subscription response.
   *
   * @param request the request
   * @return the renew subscription response
   */
  RenewSubscriptionResponse renewSubscription(RenewSubscriptionRequest request);
}
