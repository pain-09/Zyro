package com.zyroStay.zyro.service.interfac;

import com.zyroStay.zyro.dto.Response;
import com.zyroStay.zyro.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConformationCode(String confirmationCode);

    Response getAllBookings();

    Response  cancelBooking(Long bookingId);

}
