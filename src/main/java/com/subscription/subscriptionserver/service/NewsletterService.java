package com.subscription.subscriptionserver.service;

import com.subscriptionserver.proto.CreateNewsletterRequest;
import com.subscriptionserver.proto.ListNewsletterResponse;
import com.subscriptionserver.proto.NewsletterDetails;

/**
 * The interface Newsletter service.
 */
public interface NewsletterService {

  /**
   * Create newsletter newsletter details.
   *
   * @param request the request
   * @return the newsletter details
   */
  NewsletterDetails createNewsletter(CreateNewsletterRequest request);

  /**
   * List newsletter list newsletter response.
   *
   * @return the list newsletter response
   */
  ListNewsletterResponse listNewsletter();
}
