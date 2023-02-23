package com.subscription.subscriptionserver.service;

import com.subscription.subscriptionserver.entity.Newsletter;
import java.util.List;
import java.util.Optional;

public interface NewsletterRepoService {
  void save(Newsletter newsletter);

  List<Newsletter> findAll();

  Optional<Newsletter> findById(String newsletterId);
}
