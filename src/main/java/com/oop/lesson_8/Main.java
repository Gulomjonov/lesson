package com.oop.lesson_8;

//Ismsiz — bir marta ishlatish uchun, ko'pincha interface yoki abstract class bilan:
public class Main {
    interface Greeting {
        void greet(String name);
    }

    public static void main(String[] args) {

        // Odatda alohida klass yozish kerak bo'lardi:
        // public class EnglishGreeting implements Greeting { ... }

        // Anonymous class — to'g'ridan implement qilamiz
        Greeting english = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hello, " + name + "!");
            }
        };

        Greeting uzbek = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Salom, " + name + "!");
            }
        };

        english.greet("John"); // Hello, John!
        uzbek.greet("Ali");    // Salom, Ali!
    }
}

//Static nested: Tashqi klassga mantiqan bog'liq, lekin instancega bog'liq emas. Masalan: Map.Entry
//Non-static inner: Tashqi klass fieldlariga kirishi kerak bo'lganda. Masalan: Iterator
//Local class: Faqat bir metod ichida kerak bo'lgan yordamchi klass
//Anonymous class: Interface ni bir marta implement qilish kerak bo'lganda (Java 8 dan keyin — Lambda bilan almashtirildi)
