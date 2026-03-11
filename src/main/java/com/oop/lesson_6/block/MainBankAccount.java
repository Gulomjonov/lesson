package com.oop.lesson_6.block;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        Thread t1 = new Thread(() -> {
            account.deposit(300);
            account.withdraw(50);
        }, "User1");

        Thread t2 = new Thread(() -> {
            account.deposit(200);
            account.withdraw(400);
        }, "User2");

        t1.start();
        t2.start();
    }
}


//Бир банк счётига бир вақтда бир нечта фойдаланувчи (thread) кириши мумкин. Масалан:

//Бир киши пул қўйябди (депозит)
//Бошқа киши пул олябди (снятие)
//Иккаласи айни вақтда амалиётни бажаряпти

//Муаммо:
//Агар синхронизация бўлмаса, баланс нотўғри ҳисобланиши мумкин. Масалан:

//Баланс: 1000 сўм
//Thread 1: баланс ўқийди → 1000
//Thread 2: баланс ўқийди → 1000
//Thread 1: 500 қўшади → 1500 ёзади
//Thread 2: 200 олади → 800 ёзади ❌ (1300 бўлиши керак эди!)

//Ечим — synchronized методлар:
//deposit() ва withdraw() методларига synchronized қўйилади. Бу дегани — бир thread ишлаётганда, бошқаси кутади. Шундай баланс доим тўғри бўлади.
//Қисқача: synchronized — бир вақтда фақат битта thread ишлашини кафолатлайди.