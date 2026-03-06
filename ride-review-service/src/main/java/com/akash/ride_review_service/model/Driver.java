package com.akash.ride_review_service.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel{

    private String name;

    @Column(nullable = false,unique = true)
    private String drivingLicense;

    //1: n, Diver : Booking
    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings = new ArrayList<>();
}
