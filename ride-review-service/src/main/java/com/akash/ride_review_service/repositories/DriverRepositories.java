package com.akash.ride_review_service.repositories;

import com.akash.ride_review_service.model.Booking;
import com.akash.ride_review_service.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepositories extends JpaRepository<Driver,Long> {

    //hibernate sql query
    //if there is any error we find out during compile time
    //@Query("SELECT d FROM Driver d WHERE d.id = :id AND d.licenseNumber = :licence")
    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);
}
