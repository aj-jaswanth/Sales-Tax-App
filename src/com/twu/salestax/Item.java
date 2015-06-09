package com.twu.salestax;

public class Item {
    private final double basicSalesTaxPercent = 0.10;
    private final double importedSalesTaxPercent = 0.05;
    private final double actualCost;
    private final boolean isBasicSalesTaxApplicable;
    private final boolean isImported;

    public Item(double actualCost, boolean isBasicSalesTaxApplicable, boolean isImported) {
        this.actualCost = actualCost;
        this.isBasicSalesTaxApplicable = isBasicSalesTaxApplicable;
        this.isImported = isImported;
    }

    public double totalCost() {
        return actualCost + totalSalesTaxApplied();
    }

    public double totalSalesTaxApplied() {
        double totalSalesTax = 0;
        if (isBasicSalesTaxApplicable)
            totalSalesTax += actualCost * basicSalesTaxPercent;
        if (isImported)
            totalSalesTax += actualCost * importedSalesTaxPercent;
        return totalSalesTax;
    }
}
