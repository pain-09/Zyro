package com.zyroStay.zyro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zyroStay.zyro.entity.Booking;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;
    private String email;
    private String name;
    private String phoneNumber;
    private String role;
    private List<Booking> booking = new ArrayList<Booking>();



}
