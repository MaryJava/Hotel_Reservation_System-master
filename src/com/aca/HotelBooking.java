package com.aca;

import java.util.List;

public class HotelBooking implements HotelBookingService {

    @Override
    public void makeReservation(Reservation reservation) {
        boolean canMakeReservation = false;
        Room room = reservation.getRoom();

        if (room == null) {
            System.out.println("Specify a room for a reservation!");
        }
        List<Reservation> resCatalog = room.getCatalog();

        if (resCatalog.size() == 0) {
            canMakeReservation = true;
        }

        for (Reservation res : resCatalog) {
            if (reservation.getCheckout().isBefore(res.getCheckin()) || reservation.getCheckin().isAfter(res.getCheckout())) {
                canMakeReservation = true;
                break;
            }
        }

        if (canMakeReservation) {
            resCatalog.add(reservation);
            System.out.println("Reservation succeed!");
            System.out.println(reservation);
        } else {
            System.out.println("Reservation failed!");
            System.out.println(reservation);
        }


    }


    @Override
    public void cancelReservation(Room room) {

    }

    @Override
    public void checkIn() {

    }

    @Override
    public void checkOut() {

    }
}
