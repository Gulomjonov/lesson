package com.oop.collection.map;

import java.util.Arrays;

public class MyHashMap<K, V> {

    static class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;
    }

    private Node[] table;

    private int size;

    public MyHashMap() {
        table = new Node[16];
    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int index = (table.length - 1) & hash;

        Node<K, V> head = table[index];

        // agar bucket bo'sh bo'lsa
        if (head == null) {
            Node<K, V> newNode = new Node<K, V>();
            newNode.hash = hash;
            System.out.println("New node hash: " + newNode.hash);
            newNode.key = key;
            System.out.println("New node key: " +  newNode.key);
            newNode.value = value;
            System.out.println("New node value: " +  newNode.value);
            table[index] = newNode;
            System.out.println("New node index: " +  table[index].toString());
        } else {
            // collision
            Node<K, V> current = head;
            while (true) {
                if (current.key.equals(key)) {
                    current.value = value; // o'zgartirish
                    return;
                }
                if (current.next == null) break;
                current = current.next;
                System.out.println(current.key + ":" + current.value);
            }
            Node<K, V> node = new Node<K, V>();
            node.hash = hash;
            System.out.println("Node hash: " +  node.hash);
            node.key = key;
            System.out.println("Node key: " +  node.key);
            node.value = value;
            System.out.println("Node value: " +  node.value);
            current.next = node;
            System.out.println("Current next: " +  current.next.hashCode());
        }
        size++;

        // load factor tekshirish
        float loadFactor = 0.75f;
        if (size > loadFactor * table.length) {
            resize();
            System.out.println("New size after resize: " + size);
        }
    }

    private void resize() {
        Node<K, V>[] oldTable = table;
        table = new Node[oldTable.length * 2];
        size = 0;

        for (Node<K, V> node : oldTable) {
            while (node != null) {
                put(node.key, node.value); // qayta yozish yoki joylash
                node = node.next;
            }
        }
    }

    public V get(K key) {
        int hash = key.hashCode();
        int index = (table.length - 1) & hash;

        Node<K,V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }


    @Override
    public String toString() {
        return "MyHashMap{" +
                "table=" + Arrays.toString(table) +
                ", size=" + size +
                '}';
    }
}
