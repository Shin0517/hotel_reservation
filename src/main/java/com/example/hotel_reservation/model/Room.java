package com.example.hotel_reservation.model;

import jakarta.persistence.Entity;

@Entity
public class Room {
    private Integer ID;
    private String roomType;
    private Integer price;
    private Integer maxOccupancy;
//    why integer not int?

    public static Room of()
}
