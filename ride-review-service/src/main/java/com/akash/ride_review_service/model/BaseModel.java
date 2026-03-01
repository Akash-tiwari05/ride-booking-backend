package com.akash.ride_review_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public abstract class BaseModel {

    @Id// this annotation makes the id property a primary key of our tables
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //identity means auto generation
    protected Long id;

    @Column(nullable = false, updatable = false)
    @CreatedDate// this annotation tells spring that handle only object creation
    protected LocalDateTime createdAt;

    @Column(nullable = false)
    @LastModifiedDate// this annotation tells spring that handle only object creation
    protected LocalDateTime updatedAt;
}
