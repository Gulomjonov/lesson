package com.oop.lesson_1.array;

import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(50);

        var start = System.nanoTime();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 99);

        list.set(3, 40);

        System.out.print(list + "\n");
        System.out.println("ArrayList boshiga: " + (System.nanoTime() - start) / 1_000_000 + "ms");

        System.out.println(list.get(2));

        list.remove(1);
        list.remove(Integer.valueOf(20));

        System.out.println(list.contains(30));
        System.out.println(list.indexOf(30));

        System.out.println(list.size());
    }
}
