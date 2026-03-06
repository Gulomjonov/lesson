package com.oop.equals;

import java.util.Objects;

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        // obyekt bir xil  bosa true qaytaradi
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}