package com.oop.lesson_8;

public class Printer {

    public void printMessage(String message) {
        // Local class — faqat shu metod ichida ko'rinadi
        class Formatter {
            public String format(String text) {
                return text.toUpperCase();
            }
        }

        Formatter formatter = new Formatter();
        System.out.println(formatter.format(message));
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printMessage("salom"); // >>> SALOM <
    }
}