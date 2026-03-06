package com.oop.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        int N = 100_000;

        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) al.add(0, i);
        System.out.println("ArrayList boshiga: " + (System.nanoTime() - start) / 1_000_000 + "ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) ll.addFirst(i);
        System.out.println("LinkedList boshiga: " + (System.nanoTime() - start) / 1_000_000 + "ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) al.get(i / 2);
        System.out.println("ArrayList get: " + (System.nanoTime() - start) / 1_000_000 + "ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) ll.get(i / 2);
        System.out.println("LinkedList get: " + (System.nanoTime() - start) / 1_000_000 + "ms");
    }
}