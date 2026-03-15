package com.oop.lesson_7.map;

public class MyHashMap<K, V> {

    public class Entry {
        K key;
        V value;
        Entry next; // collision bo'lsa — linked list (chaining)

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Entry[] buckets;          // Entry lar massivi
    private int size;
    private static final int DEFAULT_CAPACITY = 16;   // boshlang'ich bucket soni
    private static final float LOAD_FACTOR = 0.75f;   // resize qachon bo'lishi

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new MyHashMap.Entry[DEFAULT_CAPACITY];  // to'g'ridan Entry[] yaratish
        size = 0;
    }

    private int getBucketIndex(K key) {
        if (key == null) return 0;
        return Math.abs(key.hashCode() % buckets.length);
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Entry current = buckets[bucketIndex];  // o'sha bucketdagi linked list boshi

        // Agar key allaqachon bor bo'lsa qiymatni yangilaymiz
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Agar key topilmasa yangi entry bi boshiga qoshamiz
        Entry newEntry = new Entry(key, value);
        newEntry.next = buckets[bucketIndex];
        buckets[bucketIndex] = newEntry;
        size++;

        // Load factor oshib ketsa resize qilinadi
        if ((float) size / buckets.length >= LOAD_FACTOR) {
            resize();
        }
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry current = buckets[bucketIndex];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry current = buckets[bucketIndex];
        Entry prev = null;                   // oldingi node linked listdan o'chirish uchun
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[bucketIndex] = current.next;  // 1-chi node o'chiriladi
                } else {
                    prev.next = current.next;             // o'rtadan o'chiriladi
                }
                size--;
                return current.value;                     // o'chirilgan qiymatni qaytaramiz
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    private Boolean equals(K a, K b) {
        if (a == null) return b == null;
        if (b == null) return false;
        return a.equals(b);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Bucket soni 2 barobar oshiriladi, barcha entrylar qayta joylashtiriladi
    public void resize() {
        Entry[] oldBuckets = buckets;
        buckets = (Entry[]) new Object[oldBuckets.length * 2]; // yangi massiv ochiladi
        size = 0;

        for (Entry entry : oldBuckets) {   // eski entrylarni aylanib chiqadi
            while (entry != null) {
                put(entry.key, entry.value); // yangi joyga qoyamiz
                entry = entry.next;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Entry bucket : buckets) {
            Entry current = bucket;
            while (current != null) {
                sb.append(current.key).append("=").append(current.value).append(", ");
                current = current.next;
            }
        }
        if (sb.length() > 1) sb.setLength(sb.length() - 2);
        return sb.append("}").toString();
    }
}