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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review extends BaseModel {

    private String content;

    @Column(nullable = false)
    private double rating;

}
