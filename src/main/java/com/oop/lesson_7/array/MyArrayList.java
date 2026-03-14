package com.oop.lesson_7.array;

public class MyArrayList {

    private int size;
    private int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(int element) {
        ensureCapacity(); // avvaliga capacityni tekshiramiz agar default capacitydan katta bomasa yangi massiv yaratilmaydi
        data[size] = element;
        size++;
    }

    public int get(int index) {
        checkIndex(index); // avval indexni tekshiramiz
        return data[index];
    }

    public int set(int index, int element) {
        checkIndex(index); // avval indexni tekshiramiz
        int old = data[index];
        data[index] = element;
        return old;
    }

    public int size() {
        return size;
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            int[] newData = new int[newCapacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;  // eski massiv orniga yangi massivni yaratiladi
        }
    }

    // Agar to string metodini override qilmasak
    // consoleda:

    // com.oop.lesson_7.array.MyArrayList@5e9f23b4

    // shunaqa data qaytishi mumkun

    // sababi Java-da har bir class avtomatik Object classdan meros oladi.
    // Object classining default toString() metodi shunday yozilgan

//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            str.append(data[i]);
            if (i < size - 1) str.append(", ");
        }
        return str.append("]").toString();
    }
}
