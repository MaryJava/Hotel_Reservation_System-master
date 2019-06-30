package com.aca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws ParseException {

        Guest guest = new Guest("Razmik", "Badalyan", "+374 77 11 11 11");
        System.out.println("Person wants to make a reservation");

        // create a room for reservation
        Room room = new Room(204, RoomType.FREE);

        // create few reservations
        Reservation reservation1 = new Reservation();
        LocalDateTime checkin1 = LocalDateTime.now();
        LocalDateTime checkout1 = checkin1.plusDays(5);
        reservation1.setCheckin(checkin1);
        reservation1.setCheckout(checkout1);
        reservation1.setName("11111");
        reservation1.setRoom(room);
        //System.out.println(reservation1);

        Reservation reservation2 = new Reservation();
        LocalDateTime checkin2 = LocalDateTime.now();
        LocalDateTime checkout2 = checkin2.plusDays(3);
        reservation2.setCheckin(checkin2);
        reservation2.setCheckout(checkout2);
        reservation2.setName("2222");
        reservation2.setRoom(room);
        //System.out.println(reservation2);

        Reservation reservation3 = new Reservation();
        LocalDateTime checkin3 = LocalDateTime.now().minusDays(10);
        LocalDateTime checkout3 = LocalDateTime.now().minusDays(7);
        reservation3.setCheckin(checkin3);
        reservation3.setCheckout(checkout3);
        reservation3.setName("3333");
        reservation3.setRoom(room);
        //System.out.println(reservation3);

        // make a reservation for a room
        System.out.println("----------------------------------------");
        HotelBookingService hotelBooking = new HotelBooking();
        hotelBooking.addReservation(reservation1);
        hotelBooking.addReservation(reservation2);
        hotelBooking.addReservation(reservation3);

        room.printCatalog();
        System.out.println("----------------------------------------");

        hotelBooking.cancelReservation(reservation3);
        room.printCatalog();

        System.out.println("----------------------------------------");
        hotelBooking.checkin(reservation1, guest);
        room.printCatalog();


    }
}
