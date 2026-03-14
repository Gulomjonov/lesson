package com.oop.lesson_7.linked.doublelist;

public class MyDoubleLinkedList<T> {

    private int size;
    private Node head;
    private Node tail;

    public MyDoubleLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addFirst(T element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    public void add(int index, T element) {
        checkIndexForAdd(index);
        // Case 1: Boshiga qo'shish (indeks 0)
        if (index == 0) {
//            Node newNode = new Node(element);
//            if (head == null) {
//                head = newNode;
//                tail = newNode;
//            } else {
//                newNode.next = head;
//                head.prev = newNode;
//                head = newNode;
//            }
            addFirst(element);
        } else if (index == size) {
            // Case 2: Oxirida qo'shish (indeks == size)
            addLast(element);
//            Node newNode = new Node(element);
//            tail.next = newNode;
//            newNode.prev = tail;
//            tail = newNode;
        } else {
            // Case 3: O'rtaga qo'shish

//           Belgilangan indeksdan oldingi nodega kirish

            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            // current endi qo'shish nuqtasidan oldingi point
            Node newNode = new Node(element);
            Node nodeAfter = current.next;

            // Yangi pinter yangilash
            newNode.next = nodeAfter;
            newNode.prev = current;

            // Qo'shni pointerlarni yangilash
            current.next = newNode;
            nodeAfter.prev = newNode;
            size++;
        }
    }

    public void removeFirst() {
        Node newNode = head.next;
        if (newNode != null) {
            newNode.prev = null;
        } else {
            tail = null;
        }
        head.next = null;
        head = newNode;
        size--;
    }

    public void removeLast() {
        if (head == tail) {  // bitta element qolgan bo'lsa
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void remove(int index) {
        checkIndexForAdd(index);
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public T get(int index) {
        checkIndexForAdd(index);

        Node current;

        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.data;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size)    // size oxiriga qo'shish uchun
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            str.append(current.data);
            if (current.next != null) {
                str.append(", ");
            }
            current = current.next;
        }
        str.append("]");
        return str.toString();
    }

    public class Node {
        T data;
        Node next;
        Node prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}