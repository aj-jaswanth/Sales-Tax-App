package com.twu.salestax;

import java.util.ArrayList;

public class Receipt {

    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(String itemDetails) {
        items.add(ItemParser.parse(itemDetails));
    }

    @Override
    public String toString() {
        String response = "";
        double salesTax = 0;
        double totalCost = 0;
        for (Item item : items) {
            response += item.toString() + "\n";
            salesTax += item.totalSalesTaxApplied();
            totalCost += item.totalCost();
        }
        response += "Sales Tax: " + salesTax + "\n";
        response += "Total: " + totalCost;
        return response;
    }
}
