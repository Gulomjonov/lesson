package com.oop.lesson_7.linked.single;

public class Main {
    public static void main(String[] args) {
        MySingleLinked<Integer> myLinked = new MySingleLinked<>();

        myLinked.addLast(20);
        myLinked.addLast(30);
        myLinked.addLast(25);
        myLinked.addLast(36);
        myLinked.addLast(41);
        myLinked.addLast(12);
        myLinked.addLast(16);
        myLinked.addLast(5);
        myLinked.addFirst(10);
        System.out.println(myLinked);

        myLinked.removeFirst();
        System.out.println(myLinked);

        myLinked.removeLast();
        System.out.println(myLinked);

        myLinked.addLast(50);
        myLinked.addLast(70);
        System.out.println(myLinked.get(1));
        System.out.println(myLinked.size());
        System.out.println(myLinked.isEmpty());

        myLinked.add(4, 105);
        myLinked.addLast(80);
        myLinked.add(5, 70);
        System.out.println(myLinked);

        myLinked.add(105, 7);
        System.out.println(myLinked);
    }
}

//        Console:
//
//        [10 -> 20 -> 30 -> 25 -> 36 -> 41 -> 12 -> 16 -> 5]
//        [20 -> 30 -> 25 -> 36 -> 41 -> 12 -> 16 -> 5]
//        [20 -> 30 -> 25 -> 36 -> 41 -> 12 -> 16]
//        30
//        9
//        false
//        [20 -> 30 -> 25 -> 36 -> 105 -> 70 -> 41 -> 12 -> 16 -> 50 -> 70 -> 80]
//        Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 105, Size: 12