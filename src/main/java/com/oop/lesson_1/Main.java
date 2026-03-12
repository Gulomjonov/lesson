package com.oop.lesson_1;

import com.oop.lesson_1.list.Student;
import com.oop.lesson_1.list.StudentManager;
import com.oop.lesson_1.map.Book;
import com.oop.lesson_1.map.Ombor;
import com.oop.lesson_1.map.Product;
import com.oop.lesson_1.queue.KitchenQueue;
import com.oop.lesson_1.set.Lesson;


public class Main {

    public static void main(String[] args) {
        // ArrayList
        System.out.println("\n===== Student add =====");
        StudentManager guruh = new StudentManager();
        guruh.qoshish(new Student("Ali", 20, 92));
        guruh.qoshish(new Student("Zulfiya", 21, 78));
        guruh.qoshish(new Student("Jasur", 19, 88));
        guruh.chiqarish();
        System.out.println("Studens: " + guruh.alochilar());

        // HashMap
        System.out.println("\n===== Warehouse =====");
        Ombor ombor = new Ombor();
        ombor.qoshish(new Product("Non", 3000, 50));
        ombor.qoshish(new Product("Sut", 8000, 30));
        ombor.hamma();
        System.out.println("Jami qiymat: " + ombor.jamiNarx() + " so'm");

        // Queue
        System.out.println("\n===== Students Queue in kitchen =====");
        KitchenQueue bank = new KitchenQueue();
        bank.keldi(new Student("Bobur", Product.getProduct("Non")));
        bank.keldi(new Student("Nilufar", Product.getProduct("Sut")));
        bank.xizmatKorsatish();
        bank.xizmatKorsatish();

        // HashSet
        Lesson post = new Lesson("Java dasturlash");
        post.addTag("java", "oop", "backend", "java");
        System.out.println(post);
        System.out.println("'oop' tegi bormi? " + post.haveTag("oop"));

        // TreeMap
        Book lughat = new Book();
        lughat.sozQoshish("apple", "olma");
        lughat.sozQoshish("car", "mashina");
        lughat.sozQoshish("book", "kitob");
        lughat.hammaSozlar();
    }
}
