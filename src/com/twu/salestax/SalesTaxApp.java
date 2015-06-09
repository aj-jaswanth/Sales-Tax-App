package com.twu.salestax;

public class SalesTaxApp {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.addItem("1 book at 12.49");
        receipt.addItem("1 music CD at 14.99");
        receipt.addItem("1 chocolate bar at 0.85");

        System.out.println(receipt);
    }
}
