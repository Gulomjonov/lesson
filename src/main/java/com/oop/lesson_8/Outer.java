package com.oop.lesson_8;

//Static Nested Class
public class Outer {

    private static String company = "Google";

    // Tashqi classlarga bo'gliq emas, mustaqil ishlaydi
    public static class StaticNested {
        public void show(){
            System.out.println("Company: " + company);
        }
    }

    public static void main(String[] args) {
        Outer.StaticNested outer = new Outer.StaticNested();
        outer.show();
    }
}
