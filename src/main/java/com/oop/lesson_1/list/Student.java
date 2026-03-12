package com.oop.lesson_1.list;

import com.oop.lesson_1.map.Product;

public class Student {

    private int age;
    private String name;
    private double grade;
    private Product product;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, Product product) {
        this.name = name;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Talaba{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}
