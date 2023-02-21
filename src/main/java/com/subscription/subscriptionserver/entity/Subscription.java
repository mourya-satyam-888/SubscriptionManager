package com.subscription.subscriptionserver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

/**
 * The type Subscription.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "subscriptionMapping")
public class Subscription {
  /**
   * The Id.
   */
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;
  /**
   * The Username.
   */
  @Column(name = "username")
  private String username;
  /**
   * The Validity.
   */
  private Date validity;
  /**
   * The Newsletter.
   */
  @ToString.Exclude
  @ManyToOne
  private Newsletter newsletter;
}
