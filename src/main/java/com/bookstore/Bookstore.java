package com.bookstore;

public class Bookstore {

    public static void main(String[] args) {
        System.out.println("Welcome to Books & Beans!");

        Book ifWeWereVillains = new Book("If We Were Villains", "M.L. Rio", 17.99);
        System.out.println(ifWeWereVillains.toString());
    }

}
