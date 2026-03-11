package com.oop.lesson_6.intro;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Ishlamoqda: " + Thread.currentThread().getName());
    }
}
