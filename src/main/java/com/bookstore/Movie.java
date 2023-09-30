package com.bookstore;

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

    @Override
    public String toString() {
        return title + ' ' +
                "(" + runLength + " min) " +
                "| $" + price;
    }
}
