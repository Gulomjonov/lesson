package com.oop.equals;

import java.util.HashSet;
import java.util.Set;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ali");
        Student s2 = new Student(1, "Ali");

        boolean reference = (s1 == s2);

        System.out.println("Reference: " + reference); // false

        boolean equals = s1.equals(s2);

        System.out.println("Equals two objects: " + equals); // true

        boolean hashcode = s1.hashCode() == s2.hashCode();

        System.out.println("HashCode: " + hashcode);

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s2);
        set.add(null);

        System.out.println("Get size set collection: " + set.size()); // size = 1 bo'ladi, sababi set unique ma'lumotlarni o'z ichida saqlaydi

    }
}

// Muhim koida
// agar a.equals(b) == true bo'lsa
// a.hashCode() == b.hashCode() bo'lishi SHART, ya'ni ularni har doim override qilishimiz kerak
// Bo'lmasa HashMap/HashSet noto'g'ri ishlaydi

// Equals -> ikki obyektning teng yoki teng emasligini tekshiradi

// HashCode -> obyekt uchun butun son(int) qaytaradi
// HashMap, HashSet ichida tez qidirish uchun ishlatiladi. Bir xil obyektlar bir xil hashcode qaytarishi shart!

// Qachon override qilish kerak?
// Value object yaratganda(Studeng, Product) shunga ohshash classlarda
// Kolleksiyalarda to'g'ri ishlashi uchun
// Set yoki Map da kalit sifatida ishlatilganda