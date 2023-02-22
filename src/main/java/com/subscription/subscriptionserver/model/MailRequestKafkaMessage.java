package com.subscription.subscriptionserver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Mail request kafka message.
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MailRequestKafkaMessage {
  /**
   * The Receiver.
   */
  private String receiver;
  /**
   * The Content.
   */
  private String content;
}
