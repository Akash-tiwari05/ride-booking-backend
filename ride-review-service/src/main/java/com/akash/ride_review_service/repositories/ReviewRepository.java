package com.akash.ride_review_service.repositories;

import com.akash.ride_review_service.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ReviewRepository extends JpaRepository<Review,Long> {


}
