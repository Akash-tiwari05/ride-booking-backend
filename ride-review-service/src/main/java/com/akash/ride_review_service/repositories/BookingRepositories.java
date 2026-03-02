package com.akash.ride_review_service.repositories;

import com.akash.ride_review_service.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingRepositories extends JpaRepository<Booking,Long> {
}
