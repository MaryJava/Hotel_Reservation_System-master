package com.aca;

import java.time.LocalDateTime;

public interface HotelBookingService {

    void makeReservation(Reservation reservation);
    
    void cancelReservation(Room room);

    void checkIn();

    void checkOut();
}
