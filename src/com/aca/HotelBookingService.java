package com.aca;

import java.time.LocalDateTime;

public interface HotelBookingService {

    void addReservation(Reservation reservation);

    void cancelReservation(Reservation reservation);

    void checkin(Reservation reservation, Guest guest);

    void checkOut(Room room);
}
