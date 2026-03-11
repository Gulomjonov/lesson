package com.oop.lesson_6;

public class Main {
    public static void main(String[] args) {
        MyThread t2 = new MyThread();
        MyThread t1 = new MyThread();
        t1.start();
        t2.start();

        Thread t3 = new Thread(() -> {
            System.out.println("Lambda thread: " + Thread.currentThread().getName());
        });

        t3.start();
    }

    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Thread ishlayabdi: " + Thread.currentThread().getName());
        }
    }
}