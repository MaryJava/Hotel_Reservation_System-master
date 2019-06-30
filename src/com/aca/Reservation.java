package com.aca;

import java.time.LocalDateTime;

public class Reservation {

    private String name;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    private Room room;
    private ReservationStatus reservationStatus;

    public Reservation() {
    }

    public Reservation(String name, LocalDateTime checkin, LocalDateTime checkout, Room room, ReservationStatus reservationStatus) {
        this.name = name;
        this.checkin = checkin;
        this.checkout = checkout;
        this.room = room;
        this.reservationStatus = reservationStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "name='" + name + '\'' +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                ", room=" + room +
                ", reservationStatus=" + reservationStatus +
                '}';
    }
}
