package com.zyroStay.zyro.dto;

import com.zyroStay.zyro.entity.Room;
import com.zyroStay.zyro.entity.User;

import java.time.LocalDate;

public class BookingDTO {


    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuest;
    private String bookingConfirmationCode;

    private UserDTO user;
    private RoomDTO room;


}
