package com.subscription.subscriptionserver.exceptions;


import com.subscription.subscriptionserver.enums.ExceptionCode;

/**
 * The type Resource exception.
 */
public class ResourceException extends BaseApplicationException {
  /**
   * Instantiates a new Resource exception.
   *
   * @param message the message
   */
  public ResourceException(final String message) {
    super(message, ExceptionCode.RESOURCE_NOT_FOUND);
  }
}
