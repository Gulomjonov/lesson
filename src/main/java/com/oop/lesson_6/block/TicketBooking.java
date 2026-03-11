package com.oop.lesson_6.block;

public class TicketBooking {

    private int availableSeats;

    public TicketBooking(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void bookSeat(int numberOfSeats) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " Попытка забронировать " + numberOfSeats + " места");
            if (availableSeats >= numberOfSeats) {
                System.out.println(Thread.currentThread().getName() + " Успешно забронировано " + numberOfSeats + " места");
                availableSeats -= numberOfSeats;
            } else {
                System.out.println(Thread.currentThread().getName() + " Не удалось забронировать места. Недостаточно мест.");
            }
        }
    }
}