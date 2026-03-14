package com.oop.lesson_7.linked.doublelist;

public class Main {
    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> linked = new MyDoubleLinkedList<>();

        linked.addLast(20);
        linked.addLast(30);
        linked.addLast(25);
        linked.addLast(36);
        linked.addLast(41);
        linked.addLast(12);
        linked.addLast(16);
        linked.addLast(5);
        linked.addFirst(10);
        System.out.println(linked);

        linked.removeFirst();
        System.out.println(linked);

        linked.removeLast();
        System.out.println(linked);

        linked.addLast(50);
        linked.addLast(70);
        System.out.println(linked.get(1));
        System.out.println(linked.size());
        System.out.println(linked.isEmpty());

        linked.add(4, 105);
        linked.addLast(80);
        linked.add(5, 70);
        System.out.println(linked);

        linked.add(105, 7);
        System.out.println(linked);
    }
}
