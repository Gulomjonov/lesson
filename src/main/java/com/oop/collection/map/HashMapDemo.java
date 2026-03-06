package com.oop.collection.map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        var start = System.nanoTime();
        HashMap<String, Integer> map = new HashMap<>(16, 0.75f);
        map.put("Ali", 1);
        map.put("Vali", 2);
        map.put("Hasan", 3);
        map.put("Abbos", 4);
        map.put("Dostmurod", 5);
        map.put("Ne'mat", 6);
        map.put("Husan", 7);
        map.put("Valijon", 8);
        System.out.println("Map: " + map);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        int ali = map.get("Ali");
        System.out.println("Ali index: " + ali);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);
        int def = map.getOrDefault("Zara", 0);
        System.out.println("Default: " + def);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        map.put("Ali", 23);
        System.out.println("Map: " + map);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        map.replace("Vali", 45);
        System.out.println("Map: " + map);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        map.replace("Vali", 45);
        System.out.println("Map: " + map);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        map.put("Vali", 45);
        map.put("John", 34);
        map.put("Doe", 56);
        map.put("Alice", 101);
        map.put("Bob", 102);
        map.put("Charlie", 103);
        map.put("Bob", 104); // Bobni valuesi 104 bo'ladi
        System.out.println("Map: " + map);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);
        System.out.println("Map size: " + map.size());
    }
}

// HashMap -> Key->Value juftliklar bilan ishlaydi

// Qanday ishlaydi?

// Key.hashCode() chaqiriladi
// hash % capacity -> index hisoblanadi
// O'sha index bucketda joylanadi
// Collision -> bir nechta indexlar bir hil hesh generatsiya qilsa collision holati bo'ladi

// Default capacity
// 16 bucket. Load Factor: 0.75 (16 bucketli joyda 75% to'lsa resize bo'ladi)

// Put/Get/Remove O(1) o'rtacha
// Muhim sifati -> key ishlatiladigan objectda equals + hashCode to'g'ri bo'lishi shart!
