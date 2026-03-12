package com.oop.lesson_1.queue;

import com.oop.lesson_1.list.Student;

import java.util.LinkedList;
import java.util.Queue;

public class KitchenQueue {

    private Queue<Student> navbat = new LinkedList<>();

    public void keldi(Student m) {
        navbat.offer(m);
        System.out.println(m + " navbatga qo'shildi.");
    }

    public void xizmatKorsatish() {
        Student m = navbat.poll();
        if (m != null)
            System.out.println(m + " xizmat oldi.");
        else
            System.out.println("Navbat bo'sh!");
    }

    public int navbatUzunligi() {
        return navbat.size();
    }
}
