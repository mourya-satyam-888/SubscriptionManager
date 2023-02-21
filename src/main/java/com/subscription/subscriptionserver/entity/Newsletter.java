package com.subscription.subscriptionserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 * The type Newsletter.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "newsletters")
public class Newsletter {
  /**
   * The Id.
   */
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;
  /**
   * The Title.
   */
  private String title;
  /**
   * The Price.
   */
  private int price;
  /**
   * The Validity.
   */
  private int validity;
  /**
   * The Genre.
   */
  private String genre;
  /**
   * The Subscriptions.
   */
  @OneToMany(mappedBy = "newsletter", fetch = FetchType.EAGER)
  private List<Subscription> subscriptions;
}
