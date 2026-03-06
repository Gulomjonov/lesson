package com.oop.collection.array;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        var start = System.nanoTime();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>(20); // default 10 bo'ladi, lekin men 20 bervoman

        list.add("Ali");
        list.add("Vali");

        System.out.println("Bo'shlangich ro'yhat: " + list);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);
        list.add(0, "Hasan");
        System.out.println("Yangi ro'yhat: " + list);
        System.out.println("Yangi vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        String first = list.get(0); // "Hasan" -> O(1)
        list.set(1, "Husan"); // Hasan -> Husan
        System.out.println("Yangi ro'yhat: " + list);
        System.out.println("Yangi vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        list.remove("Hasan");
        System.out.println("Yangi ro'yhat: " + list);
        System.out.println("Yangi vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        for(String s : list) {
            System.out.println("Ro'yhat: " + s);
        }
    }
}

// ArrayList ichida oddiy Object[] massiv saqlaydi.
// To'lganda avtomatik kengayadi

// Capacity har doim 10 bo'ladi
// Agar capacitydan o'rtib ketsa 1,5x kattaroq yaratiladi

// Get(i)/Set(i)
// O(1) -> ishlash tezligi

// Add() o'rtaga
// O(n) -> elementlar o'ng tomonga siljiydi

// Tartibi
// Elementlar ordered sifatida saqlanadi. null qiymant ham qabul qiladi