package com.subscription.subscriptionserver.kafka.listener;

import com.subscription.subscriptionserver.model.MailRequestKafkaMessage;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class MailRequestConsumerService {
  @KafkaListener(groupId = "${spring.kafka.mailing.topic.group-id}",
      topics = "${spring.kafka.mailing.topic.name}")
  public void mailReceiver(final MailRequestKafkaMessage mailRequestKafkaMessage) {
    //need to write logic to send the mail
    log.info(mailRequestKafkaMessage);
  }
}
