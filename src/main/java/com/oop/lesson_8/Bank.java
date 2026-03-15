package com.oop.lesson_8;

public class Bank {
    private String bankName = "NBU";
    private double balance = 5000;

    // Non-static inner class — Bank instance kerak
    public class Account {
        private String owner;

        public Account(String owner) {
            this.owner = owner;
        }

        public void showInfo() {
            // tashqi klassning private fieldlariga kira oladi!
            System.out.println(owner + " | Bank: " + bankName + " | Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Bank bank = new Bank();               // avval Outer instance
        Bank.Account acc = bank.new Account("Ali"); // keyin Inner instance
        acc.showInfo(); // Ali | Bank: NBU | Balance: 5000.0
    }
}