// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.subscriptionserver.proto;

public interface CreateNewsletterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.subscriptionmanager.CreateNewsletterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   * @return Whether the newsletter field is set.
   */
  boolean hasNewsletter();
  /**
   * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   * @return The newsletter.
   */
  com.subscriptionserver.proto.NewsletterDetails getNewsletter();
  /**
   * <code>.com.subscriptionmanager.NewsletterDetails newsletter = 1;</code>
   */
  com.subscriptionserver.proto.NewsletterDetailsOrBuilder getNewsletterOrBuilder();
}