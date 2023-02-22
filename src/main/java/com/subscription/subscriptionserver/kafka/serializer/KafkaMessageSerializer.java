package com.subscription.subscriptionserver.kafka.serializer;

import com.subscriptionserver.proto.KafkaMessage;
import org.apache.kafka.common.serialization.Serializer;

public class KafkaMessageSerializer implements Serializer<KafkaMessage> {
  @Override
  public byte[] serialize(String topic, KafkaMessage data) {
    return data.toByteArray();
  }
}
