package com.oop.lesson_1.map;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<BadKey, String> map = new HashMap<>();

        map.put(new BadKey(1), "One");
        map.put(new BadKey(1), "Two");
        map.put(new BadKey(1), "Three");

        System.out.println(map.get(new BadKey(1)));
        System.out.println(map.get(new BadKey(1)));
        System.out.println(map.get(new BadKey(1)));
        System.out.println(map.get(new BadKey(1)).hashCode());
        System.out.println(map.get(new BadKey(1)).hashCode());
        System.out.println(map.get(new BadKey(1)).hashCode());
    }
}
