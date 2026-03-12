package com.oop.lesson_1.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {

    private List<Student> talabalar = new ArrayList<>();

    public void qoshish(Student t) {
        talabalar.add(t);
    }

    public void chiqarish() {
        talabalar.forEach(System.out::println);
    }

    public List<Student> alochilar() {
        return talabalar.stream()
                .filter(t -> t.getGrade() >= 85)
                .collect(Collectors.toList());
    }
}
