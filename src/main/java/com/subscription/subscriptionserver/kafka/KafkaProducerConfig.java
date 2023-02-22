package com.subscription.subscriptionserver.kafka;

import com.subscription.subscriptionserver.model.MailRequestKafkaMessage;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaProducerConfig {
  @Value("${spring.kafka.mailing.topic.name}")
  private String topic;
  @Autowired
  private KafkaTemplate<String, MailRequestKafkaMessage> kafkaTemplate;

  public void send(final MailRequestKafkaMessage mailRequestKafkaMessage) {
    log.info("inside send");
    kafkaTemplate.send(topic, mailRequestKafkaMessage);
    log.info("completed send");
  }
}
