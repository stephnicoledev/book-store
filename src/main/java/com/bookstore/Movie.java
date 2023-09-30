package com.bookstore;

import java.text.DecimalFormat;

public class Movie extends MediaItem {
    private int runLength;

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public Movie(String title, int runLength, double price) {
        this.title = title;
        this.runLength = runLength;
        this.price = price;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        DecimalFormat money = new DecimalFormat("$0.00");
        return title + ' ' +
                "(" + runLength + " min) " +
                "| " + money.format(price);
    }
}
