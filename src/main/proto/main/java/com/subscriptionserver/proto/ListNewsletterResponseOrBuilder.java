// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.subscriptionserver.proto;

public interface ListNewsletterResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.subscriptionmanager.ListNewsletterResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   */
  java.util.List<com.subscriptionserver.proto.NewsletterDetails> 
      getNewsletterList();
  /**
   * <code>repeated .com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   */
  com.subscriptionserver.proto.NewsletterDetails getNewsletter(int index);
  /**
   * <code>repeated .com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   */
  int getNewsletterCount();
  /**
   * <code>repeated .com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   */
  java.util.List<? extends com.subscriptionserver.proto.NewsletterDetailsOrBuilder> 
      getNewsletterOrBuilderList();
  /**
   * <code>repeated .com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   */
  com.subscriptionserver.proto.NewsletterDetailsOrBuilder getNewsletterOrBuilder(
      int index);
}
