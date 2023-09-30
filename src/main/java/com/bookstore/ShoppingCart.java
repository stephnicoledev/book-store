package com.bookstore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> booksToBuy = new ArrayList<>();

    public void add(Book book) {
        booksToBuy.add(book);
    }

    public double getTotalPrice() {
        double total = 0.0;

        for (Book book : booksToBuy) {
            total += book.getPrice();
        }
        return total;
    }
}
