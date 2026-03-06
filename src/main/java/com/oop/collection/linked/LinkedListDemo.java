package com.oop.collection.linked;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        var start = System.nanoTime();

        ll.addFirst("Ali");
        System.out.println("Add First: " + ll);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);
        ll.addLast("Vali");
        System.out.println("Add Last: " + ll);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);
        ll.add("Vali");
        ll.add("John");
        ll.add("Doe");
        ll.add("Doe");
        ll.add("Abbos");
        ll.add("Dostmurod");
        ll.add("Ne'mat");
        ll.add("Javohir");
        ll.add("Nodir");
        System.out.println("New list: " + ll);
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);


        System.out.println("First: " + ll.getFirst());
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        System.out.println("Last: " + ll.getLast());
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);

        System.out.println("Index boyicha: " + ll.get(5));
        System.out.println("Qancha vaqt ketgani: " + (System.nanoTime() - start) / 1_000_000);
    }
}

// LinkedList -> ikki tomonlama Single and Doubly Linked List

// Doubly Linked List null <=> PREV | DATA | NEXT <=> PREV | DATA | NEXT <=> PREV | DATA | NEXT ..... <=> null
// Single Linked List null => DATA | NEXT => DATA | NEXT => DATA | NEXT ..... => null

// Add/Remove -> O(1) pointer o'zgarmaydi, ishlashi tez

// Get(i) -> O(n) oxirigacha yurishi kerak

// Xotira -> ArrayListdan ko'p joy egallaydi (prev + next pointer)
