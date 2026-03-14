package com.oop.lesson_7.linked.single;

// Single LinkedList
public class MySingleLinked<T> {

    private Node head;
    private int size;

    public MySingleLinked() {
        head = null;
        size = 0;
    }

    public void addFirst(T t) {
        Node newNode = new Node(t);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(T t) {
        Node newNode = new Node(t);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new RuntimeException("List is empty");
        T removed = head.data;
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new RuntimeException("List is empty");

        if (size == 1) { // faqat bitta element bo'lsa
            T removed = head.data;
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        T removed = current.next.data;
        current.next = null;
        size--;
    }

    public T get(int index) {
        checkIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void add(int index, T t) {
        checkIndexForAdd(index);

        Node newNode = new Node(t);

        if (index == 0) {
            addFirst(t);
        } else if (index == size) {
            addLast(t);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size)    // size oxiriga qo'shish uchun
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            s.append(current.data);
            if (current.next != null) s.append(" -> ");
            current = current.next;
        }
        return s.append("]").toString();
    }

    // Inner class
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }
}