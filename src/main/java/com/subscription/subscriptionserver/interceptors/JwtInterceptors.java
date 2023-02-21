package com.subscription.subscriptionserver.interceptors;

import com.subscription.subscriptionserver.constants.ExceptionMessageConstants;
import com.subscription.subscriptionserver.constants.HeaderConstants;
import com.subscription.subscriptionserver.exceptions.ResourceException;
import com.subscription.subscriptionserver.util.JwtUtil;
import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The type Jwt interceptors.
 */
@Component
@Log4j2
public class JwtInterceptors implements ServerInterceptor {
  /**
   * The Jwt util.
   */
  @Autowired
  private JwtUtil jwtUtil;

  @Override
  public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
      final ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
    try {
      log.info(call.getMethodDescriptor());
      final String username = extractUserFromJwtToken(headers);
      log.info(username);
      Context context = Context.current().withValue(HeaderConstants.USER_ID, username);
      return Contexts.interceptCall(context, call, headers, next);
    } catch (Exception e) {
      call.close(
          Status.UNAUTHENTICATED
              .withDescription(ExceptionMessageConstants.INVALID_TOKEN), new Metadata());
    }
    return new ServerCall.Listener<ReqT>() {
    };
  }

  /**
   * Extract user from jwt token string.
   *
   * @param headers the headers
   * @return the string
   */
  public String extractUserFromJwtToken(final Metadata headers) {
    try {
      return jwtUtil.extractUsername((String) headers.get(HeaderConstants.JWT_METADATA_KEY));
    } catch (Exception e) {
      log.info(e);
      throw new ResourceException(ExceptionMessageConstants.INVALID_TOKEN);
    }
  }
}
