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

        // create a reservation
        Reservation reservation1 = new Reservation();
        LocalDateTime checkin1 = LocalDateTime.now();
        LocalDateTime checkout1 = checkin1.plusDays(5);
        reservation1.setCheckin(checkin1);
        reservation1.setCheckout(checkout1);
        reservation1.setRoom(room);

        Reservation reservation2 = new Reservation();
        LocalDateTime checkin2 = LocalDateTime.now();
        LocalDateTime checkout2 = checkin2.plusDays(3);
        reservation2.setCheckin(checkin2);
        reservation2.setCheckout(checkout2);
        reservation2.setRoom(room);

        Reservation reservation3 = new Reservation();
        LocalDateTime checkin3 = LocalDateTime.now().minusDays(10);
        LocalDateTime checkout3 = LocalDateTime.now().minusDays(7);
        reservation3.setCheckin(checkin3);
        reservation3.setCheckout(checkout3);
        reservation3.setRoom(room);

        // make a reservation for a room
        HotelBookingService hotelBooking = new HotelBooking();
        hotelBooking.makeReservation(reservation1);
        hotelBooking.makeReservation(reservation2);
        hotelBooking.makeReservation(reservation3);


        System.out.println("----------------------------------------");
        // print all reservations for a room
        List<Reservation> catalog = room.getCatalog();
        for (Reservation res : catalog) {
            System.out.println(res);
        }

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        //-----------------------------------------
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2009-12-31");
        Date date2 = sdf.parse("2010-01-31");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.after(date2)) {
            System.out.println("Date1 is after Date2");
        }

        if (date1.before(date2)) {
            System.out.println("Date1 is before Date2");
        }

        if (date1.equals(date2)) {
            System.out.println("Date1 is equal Date2");
        }
    }
}
