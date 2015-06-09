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
        for (Item item : items)
            response += item.toString() + "\n";
        return response;
    }
}
