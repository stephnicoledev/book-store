package com.bookstore;

public class MediaItem implements Purchasable {
    protected String title;
    protected double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean isTaxable() {
        return true;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
