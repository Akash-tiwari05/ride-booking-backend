package com.akash.ride_review_service.repositories;

import com.akash.ride_review_service.model.Booking;
import com.akash.ride_review_service.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepositories extends JpaRepository<Driver,Long> {

    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenceNumber);
}
