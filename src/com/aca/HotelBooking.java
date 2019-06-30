package com.aca;

import java.util.List;

public class HotelBooking implements HotelBookingService {

    private static int index = 0;

    @Override
    public void addReservation(Reservation reservation) {
        boolean canMakeReservation = false;
        Room room = reservation.getRoom();
        Reservation catalog[] = room.getCatalog();

        if (room == null) {
            System.out.println("Specify a room for a reservation!");
        }

        if (isCatalogEmpty(catalog)) {
            catalog[index++] = reservation;
            System.out.println("Reservation succeed!");
            System.out.println(reservation);
            return;
        }


        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] != null) {
                if (reservation.getCheckout().isBefore(catalog[i].getCheckin()) || reservation.getCheckin().isAfter(catalog[i].getCheckout())) {
                    canMakeReservation = true;
                    break;
                }
            }
        }

        if (canMakeReservation) {
            catalog[index++] = reservation;
            System.out.println("Reservation succeed!");
            System.out.println(reservation);
        } else {
            System.out.println("Reservation failed!");
            System.out.println(reservation);
        }
    }


    @Override
    public void cancelReservation(Reservation reservation) {
        Room room = reservation.getRoom();
        Reservation[] catalog = room.getCatalog();

        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] == reservation) {
                catalog[i] = null;
                System.out.println("Reservation has been canceled: " + reservation);
            }
        }

    }


    @Override
    public void checkOut(Room room) {
        Guest roomGuest = room.getGuest();
        room.setGuest(null);
        System.out.println(roomGuest + " has checked out from a room");
        System.out.println("Now " + room + " is free!");

        // period of stay and guest
    }

    @Override
    public void checkin(Reservation reservation, Guest guest) {
        Room room = reservation.getRoom();
        Reservation[] catalog = room.getCatalog();
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] == reservation) {
                catalog[i] = null;
                room.setGuest(guest);
                System.out.println(guest + " just has checked in a " + room);
            }
        }

    }


    private boolean isCatalogEmpty(Reservation[] catalog) {
        boolean isEmpty = true;
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }
}
