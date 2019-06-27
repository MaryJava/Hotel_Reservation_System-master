package com.aca;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private final int number;
    private Guest guest;
    private RoomType roomType;
    private List<Reservation> catalog = new ArrayList<>();


    public Room(int number) {
        this.number = number;
    }

    public Room(int number, RoomType roomType) {
        this(number);
        this.roomType = roomType;
    }

    public Room(int number, Guest guest) {
        this(number);
        this.guest = guest;
    }

    public int getNumber() {
        return number;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public List<Reservation> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Reservation> catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", roomType=" + roomType +
                '}';
    }
}
