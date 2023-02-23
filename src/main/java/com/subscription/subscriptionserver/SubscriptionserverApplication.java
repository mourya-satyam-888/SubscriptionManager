package com.subscription.subscriptionserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * The type Subscriptionserver application.
 */
@SpringBootApplication
@EnableCaching
public class SubscriptionserverApplication {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(final String[] args) {
    SpringApplication.run(SubscriptionserverApplication.class, args);
  }

}
