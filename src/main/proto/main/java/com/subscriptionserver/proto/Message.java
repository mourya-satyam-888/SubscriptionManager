// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.subscriptionserver.proto;

public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_subscriptionmanager_NewsletterDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_subscriptionmanager_NewsletterDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_subscriptionmanager_Subscription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_subscriptionmanager_Subscription_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_subscriptionmanager_KafkaMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_subscriptionmanager_KafkaMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\027com.subscriptionmanager" +
      "\"^\n\021NewsletterDetails\022\n\n\002id\030\001 \001(\t\022\r\n\005tit" +
      "le\030\002 \001(\t\022\r\n\005price\030\003 \001(\005\022\020\n\010validity\030\004 \001(" +
      "\005\022\r\n\005genre\030\005 \001(\t\"Z\n\014Subscription\022\n\n\002id\030\001" +
      " \001(\t\022\025\n\rnewsletter_id\030\002 \001(\t\022\020\n\010username\030" +
      "\003 \001(\t\022\025\n\rvalidity_date\030\004 \001(\t\"1\n\014KafkaMes" +
      "sage\022\020\n\010receiver\030\001 \001(\t\022\017\n\007content\030\002 \001(\tB" +
      " \n\034com.subscriptionserver.protoP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_subscriptionmanager_NewsletterDetails_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_subscriptionmanager_NewsletterDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_subscriptionmanager_NewsletterDetails_descriptor,
        new java.lang.String[] { "Id", "Title", "Price", "Validity", "Genre", });
    internal_static_com_subscriptionmanager_Subscription_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_subscriptionmanager_Subscription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_subscriptionmanager_Subscription_descriptor,
        new java.lang.String[] { "Id", "NewsletterId", "Username", "ValidityDate", });
    internal_static_com_subscriptionmanager_KafkaMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_subscriptionmanager_KafkaMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_subscriptionmanager_KafkaMessage_descriptor,
        new java.lang.String[] { "Receiver", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
