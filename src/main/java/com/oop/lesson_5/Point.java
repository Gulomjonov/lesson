package com.oop.lesson_5;

public final class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
}

// Immutability class yaratish qoidalari
// 1. final class - meros olishni bloklash
// 2. Barcha fieldlar private final bo'lishi kk
// 3. Setter metodidan foydalanmasligimiz kerak
// 4. Constructor orqali qiymat berish
// 5. Mutable ob'ektlarni (List, Date) himoya qilish - defensive copy