package com.subscription.subscriptionserver.constants;

import io.grpc.Context;
import io.grpc.Metadata;

/**
 * The type Header constants.
 */
public class HeaderConstants {
  /**
   * The constant JWT_METADATA_KEY.
   */
  public static final Metadata.Key<String> JWT_METADATA_KEY = Metadata
      .Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
  /**
   * The constant USER_ID.
   */
  public static final Context.Key<String> USER_ID = Context.key("userId");
}
