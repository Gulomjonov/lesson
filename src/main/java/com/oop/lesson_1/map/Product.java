package com.oop.lesson_1.map;

import java.util.Objects;

public class Product {

    private String name;
    private static double price;
    private static int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public static Product getProduct(String product) {
        return new Product(product, price, amount);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && amount == product.amount && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, amount);
    }

    @Override
    public String toString() {
        return name + " - " + price + " so'm (" + amount + " dona)";
    }
}
