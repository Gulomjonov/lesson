package com.oop.lesson_7.map;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("Nodir", 90);
        map.put("Qodir", 85);
        map.put("Islom", 92);
        map.put("Nodir", 95);        // update — Nodir qiymati o'zgaradi

        System.out.println(map);     // {Nodir=95, Qodir=85, Islom=92}

        System.out.println(map.get("Qodir"));      // 85
        System.out.println(map.get("Nodir"));    // 95
        System.out.println(map.get("Unknown"));  // null

        map.remove("Qodir");
        System.out.println(map);     // {Nodir=95, Islom=92}

        System.out.println(map.size());    // 2
        System.out.println(map.isEmpty()); // false
    }
}