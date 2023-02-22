package com.subscription.subscriptionserver.kafka.deserializer;

import com.subscriptionserver.proto.KafkaMessage;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.serialization.Deserializer;

@Log4j2
public class KafkaMessageDeserializer implements Deserializer<KafkaMessage> {
  @Override
  public KafkaMessage deserialize(String topic, byte[] data) {
    KafkaMessage kafkaMessage = KafkaMessage.newBuilder().build();
    try {
      kafkaMessage = KafkaMessage.parseFrom(data);
    } catch (Exception e) {
      log.error(e);
    }
    return kafkaMessage;
  }
}
