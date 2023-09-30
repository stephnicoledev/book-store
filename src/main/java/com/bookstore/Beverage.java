package com.bookstore;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Beverage extends CafeItem implements Purchasable {
    private String size;
    private List<String> additions = new ArrayList<>();

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void add(String addition) {
        additions.add(addition);
    }

    public Beverage(String size, String name, String[] additions, double price) {
        this.size = size;
        this.name = name;
        this.additions.addAll(Arrays.asList(additions));
        this.price = price;
    }

    @Override
    public String toString() {
        DecimalFormat money = new DecimalFormat("$0.00");
        return size + " " + name + " (" + String.join(", ", additions) + ") | " + money.format(price);
    }

    @Override
    public boolean isTaxable() {
        return true;
    }
}
