package com.subscription.subscriptionserver.util;

import com.subscription.subscriptionserver.constants.HeaderConstants;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * The type Grpc utils.
 */
@NoArgsConstructor
@Getter
@Setter
@Component
public class GrpcUtils {
  /**
   * Gets username.
   *
   * @return the username
   */
  public Optional<String> getUsername() {
    return Optional.ofNullable(HeaderConstants.USER_ID.get());
  }
}
