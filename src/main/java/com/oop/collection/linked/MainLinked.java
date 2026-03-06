package com.oop.collection.linked;

import java.util.LinkedList;

public class MainLinked {
    public static void main(String[] args) {

        LinkedList<Integer> node = new LinkedList<>();

        var start = System.nanoTime();

        node.add(10);
        node.add(20);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        node.add(30);
        System.out.print(node + "\n");

        node.add(12, 99);

        System.out.println("LinkedList add to : " + (System.nanoTime() - start) / 1_000_000 + "ms");

        node.set(3, 40);

        System.out.println("LinkedList set to : " + (System.nanoTime() - start) / 1_000_000 + "ms");

        System.out.println(node.get(2));

        System.out.println("LinkedList get : " + (System.nanoTime() - start) / 1_000_000 + "ms");

        node.remove(1);
        node.remove(Integer.valueOf(20));

        System.out.println(node.contains(30));
        System.out.println(node.indexOf(30));

        System.out.println(node.size());
    }
}
