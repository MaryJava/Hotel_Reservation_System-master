package com.aca;

public class Room {

    private final int number;
    private Guest guest;
    private RoomType roomType;
    private Reservation[] catalog = new Reservation[3];


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

    public Reservation[] getCatalog() {
        return catalog;
    }

    public void setCatalog(Reservation[] catalog) {
        this.catalog = catalog;
    }

    public void printCatalog() {
        for (Reservation reservation : catalog) {
            System.out.println(reservation);
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", roomType=" + roomType +
                '}';
    }
}
