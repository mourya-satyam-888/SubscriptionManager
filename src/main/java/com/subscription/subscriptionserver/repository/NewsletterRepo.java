package com.subscription.subscriptionserver.repository;

import com.subscription.subscriptionserver.entity.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Newsletter repo.
 */
public interface NewsletterRepo extends JpaRepository<Newsletter, String> {
}
