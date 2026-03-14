package com.oop.lesson_7.array;

public class Main {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.set(1, 100);
        System.out.println(list);

        System.out.println(list.get(1));


        MyArray<String> str = new MyArray<>();

        str.add("Nodir");
        str.add("Abdulloh");
        str.add("Karim");
        str.add("Nurillo");
        str.add("Jobir");
        str.add("Asror");
        str.add("Aziz");
        str.add("Bilol");
        str.add("Oraz");
        str.add("Husan");
        str.add("Hasan");
        str.add("Begi");
        str.add("Nizomiy");
        str.add("Hoji");

        System.out.println(str);
        System.out.println(str.get(1));

        str.remove(1); // Abdulloh remove bo'ladi
        System.out.println(str);

        str.set(2, "Tolib"); // Nurilloni o'rniga Tolib qo'shiladi
        System.out.println(str);

        str.add(5, "Yuriy");  // 5 index value Yuriyga o'zgaradi
        System.out.println(str);
    }
}

// Consoleda shular chiqadi

//        [10, 20, 30, 40, 50]
//        [10, 100, 30, 40, 50]
//        100
//        New Capacity: 20
//        [Nodir, Abdulloh, Karim, Nurillo, Jobir, Asror, Aziz, Bilol, Oraz, Husan, Hasan, Begi, Nizomiy, Hoji]
//        Abdulloh
//        [Nodir, Karim, Nurillo, Jobir, Asror, Aziz, Bilol, Oraz, Husan, Hasan, Begi, Nizomiy, Hoji]
//        [Nodir, Karim, Tolib, Jobir, Asror, Aziz, Bilol, Oraz, Husan, Hasan, Begi, Nizomiy, Hoji]
//        [Nodir, Karim, Tolib, Jobir, Asror, Yuriy, Aziz, Bilol, Oraz, Husan, Hasan, Begi, Nizomiy, Hoji]