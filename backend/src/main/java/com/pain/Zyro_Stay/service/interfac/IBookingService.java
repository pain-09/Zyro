package com.pain.Zyro_Stay.service.interfac;

import com.pain.Zyro_Stay.dto.Response;
import com.pain.Zyro_Stay.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
