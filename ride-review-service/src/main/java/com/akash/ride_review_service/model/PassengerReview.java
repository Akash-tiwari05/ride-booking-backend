package com.akash.ride_review_service.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PassengerReview extends Review{

    private String passengerReviewComments;

    private String passengerRating;
}
