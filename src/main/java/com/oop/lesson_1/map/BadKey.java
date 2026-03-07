package com.oop.lesson_1.map;

import java.util.Objects;

public class BadKey {
    private int key;

    public BadKey(int key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BadKey badKey = (BadKey) o;
        return Objects.equals(key, badKey.key);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "BadKey{" +
                "key='" + key + '\'' +
                '}';
    }
}
