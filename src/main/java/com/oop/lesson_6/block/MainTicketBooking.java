package com.oop.lesson_6.block;

public class MainTicketBooking {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking(10);

        Thread t1 = new Thread(() -> ticketBooking.bookSeat(4), "User1");
        Thread t2 = new Thread(() -> ticketBooking.bookSeat(7), "User2");

        t1.start();
        t2.start();
    }
}
