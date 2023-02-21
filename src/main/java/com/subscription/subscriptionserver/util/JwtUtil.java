package com.subscription.subscriptionserver.util;

import com.subscription.subscriptionserver.constants.ExceptionMessageConstants;
import com.subscription.subscriptionserver.constants.JwtConstants;
import com.subscription.subscriptionserver.exceptions.ResourceException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The type Jwt util.
 */
@Component
public class JwtUtil {
  /**
   * The Secret.
   */
  @Value("${jwt.secret}")
  private String secret;

  /**
   * Extract username string.
   *
   * @param token the token
   * @return the string
   */
  public String extractUsername(final String token) {
    if (!validateJwtToken(token)) {
      throw new ResourceException(ExceptionMessageConstants.INVALID_TOKEN);
    }
    return extractAllClaims(token).getSubject();
  }

  /**
   * Extract user id string.
   *
   * @param token the token
   * @return the string
   */
  public String extractUserId(final String token) {
    if (!validateJwtToken(token)) {
      throw new ResourceException(ExceptionMessageConstants.INVALID_TOKEN);
    }
    return extractAllClaims(token).get(JwtConstants.USER_ID, String.class);
  }

  /**
   * Extract expiration date.
   *
   * @param token the token
   * @return the date
   */
  public Date extractExpiration(final String token) {
    return extractAllClaims(token).getExpiration();
  }

  /**
   * Extract all claims claims.
   *
   * @param token the token
   * @return the claims
   */
  private Claims extractAllClaims(final String token) {
    return Jwts.parser().setSigningKey(secret)
        .parseClaimsJws(token)
        .getBody();
  }

  public Boolean validateJwtToken(final String token) {
    return !extractExpiration(token).before(new Date());
  }
}
