package com.bookstore;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Purchasable> itemsToBuy = new ArrayList<>();
    private double taxRate;

    public ShoppingCart(double taxRate) {
        this.taxRate = taxRate;
    }
    public void add(Purchasable itemToAdd) {
        itemsToBuy.add(itemToAdd);
    }

    public double getSubtotalPrice() {
        // Sum the prices of all items
        double subtotal = 0.0;
        for (Purchasable item : itemsToBuy) {
            subtotal += item.getPrice();
        }
        return subtotal;
    }

    public double getTax() {
        // Apply the tax rate to the price of all the taxable items
        double tax = 0.0;
        for (Purchasable item : itemsToBuy) {
            if (item.isTaxable()){
                tax += item.getPrice() * this.taxRate;
            }
        }
        return tax;
    }

    public double getTotalPrice() {
        // Sum the price of all items, plus the tax rate applied to the price of only taxable items
        return getSubtotalPrice() + getTax();
    }

    public String checkOutReceipt() {
        String libraryReceipt = "\nCheckout Receipt\n";
        libraryReceipt += "No. of items: " + itemsToBuy.size();
        libraryReceipt += "\n\n";
        for (Purchasable item : itemsToBuy) {
            libraryReceipt += item;
            libraryReceipt += "\n";
        }
        return libraryReceipt;
    }

    public String receipt() {
        String receipt = "\nCheckout Receipt\n";
        receipt += "No. of items: " + itemsToBuy.size();
        receipt += "\n\n";
        for (Purchasable item : itemsToBuy) {
            receipt += item;
            receipt += "\n";
        }

        DecimalFormat money = new DecimalFormat ("$0.00");
        receipt += "\nSubtotal: " + money.format(getSubtotalPrice());
        receipt += "\nTax: " + money.format(getTax());
        receipt += "\nTotal: " + money.format(getTotalPrice());

        return receipt;
    }
}
