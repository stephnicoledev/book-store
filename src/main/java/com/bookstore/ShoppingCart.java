package com.bookstore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<MediaItem> itemsInCart = new ArrayList<>();

    public void add(MediaItem item) {

        itemsInCart.add(item);
    }

    public double getTotalPrice() {
        double total = 0.0;

        for (MediaItem item : itemsInCart) {
            total += item.getPrice();
        }
        return total;
    }

    public String receipt() {
        String receipt = "\nReceipt\n";

        for (MediaItem item : itemsInCart) {
            receipt += item;
            receipt += "\n";
        }
        receipt += "\nTotal: $" + getTotalPrice();
        return receipt;
    }
}
