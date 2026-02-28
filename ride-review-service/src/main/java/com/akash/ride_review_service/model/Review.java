package com.akash.ride_review_service.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Entity
// It connects your entity to a listener class
// that runs automatically on certain events.
// And automatically fills fields like:
// (@CreatedDate, @LastModifiedDate, @CreatedBy, @LastModifiedBy)
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review {

    @Id// this annotation makes the id property a primary key of our tables
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //identity means auto generation
    private Long id;
    private String content;

    @Column(nullable = false)
    private double rating;

    @Column(nullable = false, updatable = false)
    @CreatedDate// this annotation tells spring that handle only object creation
    private LocalDateTime createdAt;

    @Column(nullable = false)
    @LastModifiedDate// this annotation tells spring that handle only object creation
    private LocalDateTime updatedAt;
}
