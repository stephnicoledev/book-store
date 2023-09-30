package com.bookstore;

import java.text.DecimalFormat;

public class Book extends MediaItem {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    @Override
    public String toString() {
        DecimalFormat money = new DecimalFormat("$0.00");
        return title + ' ' +
                "by " + author + ' ' +
                "| " + money.format(price);
    }
}

