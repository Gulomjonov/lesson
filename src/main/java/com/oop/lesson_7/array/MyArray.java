package com.oop.lesson_7.array;

public class MyArray<T> {

    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArray() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        ensureCapacity(); // capacitini tekshiramiz
        data[size++] = element;
    }

    public void add(int index, T element) {
        checkIndexForAdd(index); // agar index 0-dan kichik yoki sizedan katta bo'lsa hatolik qaytaramiz
        ensureCapacity();
        // index dan keying elementlarni bir joy ongga suriladi
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element; // boshatilgan joyga yangi elementni qoyamiz
        size++;                // element soni bittaga oshadi
    }

    public T remove(int index) {
        checkIndex(index);
        T removed = (T) data[index];
        // Bu yerda esa keyingi element bir joyga chapga suriladi
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        return removed;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    public T set(int index, T element) {
        checkIndex(index);
        T old = (T) data[index];
        data[index] = element;
        return old;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            Object[] newData = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
            System.out.println("New Capacity: " + newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}
