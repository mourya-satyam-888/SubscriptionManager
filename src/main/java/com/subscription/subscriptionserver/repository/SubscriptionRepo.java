package com.subscription.subscriptionserver.repository;

import com.subscription.subscriptionserver.entity.Newsletter;
import com.subscription.subscriptionserver.entity.Subscription;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Subscription repo.
 */
public interface SubscriptionRepo extends JpaRepository<Subscription, String> {
  /**
   * Exists by username and newsletter boolean.
   *
   * @param username   the username
   * @param newsletter the newsletter
   * @return the boolean
   */
  boolean existsByUsernameAndNewsletter(String username, Newsletter newsletter);

  /**
   * Find all by username list.
   *
   * @param username the username
   * @return the list
   */
  List<Subscription> findAllByUsername(String username);
}
