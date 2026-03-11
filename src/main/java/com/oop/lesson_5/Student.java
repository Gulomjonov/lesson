package com.oop.lesson_5;

import lombok.Getter;

import java.util.Collections;
import java.util.List;

public final class Student {
    @Getter
    private final String name;
    private final List<String> courses;

    public Student(final String name, final List<String> courses) {
        this.name = name;
        // bunday holatda biz listni ko'chirmayabmiz, faqat bir xil listga ikkita pointer qoyabmiz
        // Tashqaridan o'zgartirsa student ichidagi ham o'zgaradi, chunki ikkalasi ham bir xil obyektga ishora qiladi
//        this.courses = courses;
        this.courses = List.copyOf(courses);
    }

    public List<String> getCourses() {
        return Collections.unmodifiableList(courses);
    }
}
