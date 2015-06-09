package com.twu.salestax;

public class Item {
    private final double basicSalesTaxPercent = 0.10;
    private final double importedSalesTaxPercent = 0.05;
    private final double actualCost;
    private final int quantity;
    private final boolean isBasicSalesTaxApplicable;
    private final boolean isImported;

    public Item(int quantity, double actualCost, boolean isBasicSalesTaxApplicable, boolean isImported) {
        this.quantity = quantity;
        this.actualCost = actualCost;
        this.isBasicSalesTaxApplicable = isBasicSalesTaxApplicable;
        this.isImported = isImported;
    }

    public double totalCost() {
        return quantity * actualCost + totalSalesTaxApplied();
    }

    public double totalSalesTaxApplied() {
        double totalSalesTax = 0;
        if (isBasicSalesTaxApplicable)
            totalSalesTax += actualCost * basicSalesTaxPercent;
        if (isImported)
            totalSalesTax += actualCost * importedSalesTaxPercent;
        return quantity * totalSalesTax;
    }
}
