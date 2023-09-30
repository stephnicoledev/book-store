package com.bookstore;

public class CafeItem implements Purchasable {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
