package com.subscription.subscriptionserver.service.impl;

import com.subscription.subscriptionserver.entity.Newsletter;
import com.subscription.subscriptionserver.repository.NewsletterRepo;
import com.subscription.subscriptionserver.service.NewsletterRepoService;
import java.util.List;
import java.util.Optional;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class NewsletterRepoServiceImpl implements NewsletterRepoService {
  @Autowired
  private NewsletterRepo newsletterRepo;

  @Override
  @CacheEvict(value = "newsletters", allEntries = true)
  public void save(Newsletter newsletter) {
    newsletterRepo.save(newsletter);
  }

  @Override
  @Cacheable(value = "newsletters", key = "#root.methodName")
  public List<Newsletter> findAll() {
    log.info("inside DB query");
    return newsletterRepo.findAll();
  }

  @Override
  @Cacheable(value = "newsletters", key = "#root.methodName.concat(#newsletterId)")
  public Optional<Newsletter> findById(String newsletterId) {
    return newsletterRepo.findById(newsletterId);
  }
}
