package com.oop.lesson_1.map;

import java.util.HashMap;
import java.util.Map;

public class Ombor {

    private Map<String, Product> mahsulotlar = new HashMap<>();

    public void qoshish(Product m) {
        mahsulotlar.put(m.getName(), m);
    }

    public Product topish(String nomi) {
        return mahsulotlar.getOrDefault(nomi, null);
    }

    public void hamma() {
        mahsulotlar.forEach((k, v) -> System.out.println(k + " => " + v));
    }

    public double jamiNarx() {
        return mahsulotlar.values().stream()
                .mapToDouble(m -> m.getPrice() * m.getAmount())
                .sum();
    }
}