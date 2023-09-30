package com.bookstore;

public class Bookstore {

    public static void main(String[] args) {
        System.out.println("Welcome to Books & Beans!");

        Book ifWeWereVillains = new Book("If We Were Villains", "M.L. Rio", 17.99);
        Book theOnceAndFutureWitches = new Book("The Once and Future Witches", "Alix E. Harrow", 17.99);
        Book suchSharpTeeth = new Book("Such Sharp Teeth", "Rachel Harrison", 17.00);
        Book theMaidens = new Book("The Maidens", "Alex Michaelides", 17.99);
        Book youAgain = new Book("You Again", "Kate Goldbeck", 24.99);

        ShoppingCart autumnBooks = new ShoppingCart();

        autumnBooks.add(ifWeWereVillains);
        autumnBooks.add(theOnceAndFutureWitches);
        autumnBooks.add(suchSharpTeeth);
        autumnBooks.add(theMaidens);
        autumnBooks.add(youAgain);

        System.out.println(autumnBooks.receipt());
    }

}
