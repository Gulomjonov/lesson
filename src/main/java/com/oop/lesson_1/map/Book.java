package com.oop.lesson_1.map;

import java.util.TreeMap;

public class Book {

    private TreeMap<String, String> book = new TreeMap<>();

    public void sozQoshish(String soz, String tarjima) {
        book.put(soz, tarjima);
    }

    public String tarjimaTopish(String soz) {
        return book.getOrDefault(soz, "Topilmadi");
    }

    public void hammaSozlar() {
        book.forEach((s, t) -> System.out.println(s + " = " + t));
    }
}