package com.akash.ride_review_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review {

    @Id// this annotation makes the id property a primary key of our tables
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


}
