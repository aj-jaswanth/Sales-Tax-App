package com.twu.salestax;

public class Item {

    private String itemDetails;

    public Item(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public double actualCost() {
        return 10;
    }
}
