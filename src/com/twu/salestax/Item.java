package com.twu.salestax;

public class Item {
    private final double basicSalesTaxPercent = 0.10;
    private final double importedSalesTaxPercent = 0.05;
    private final double actualCost;
    private final String description;
    private final int quantity;
    private final boolean isBasicSalesTaxApplicable;
    private final boolean isImported;

    public Item(String description, int quantity, double actualCost, boolean isBasicSalesTaxApplicable, boolean isImported) {
        this.description = description;
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

    @Override
    public String toString() {
        return description + ": " + totalCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Item item = (Item) o;

        if (Double.compare(item.basicSalesTaxPercent, basicSalesTaxPercent) != 0)
            return false;
        if (Double.compare(item.importedSalesTaxPercent, importedSalesTaxPercent) != 0)
            return false;
        if (Double.compare(item.actualCost, actualCost) != 0)
            return false;
        if (quantity != item.quantity)
            return false;
        if (isBasicSalesTaxApplicable != item.isBasicSalesTaxApplicable)
            return false;
        if (isImported != item.isImported)
            return false;
        return !(description != null ? !description.equals(item.description) : item.description != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(basicSalesTaxPercent);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(importedSalesTaxPercent);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(actualCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + (isBasicSalesTaxApplicable ? 1 : 0);
        result = 31 * result + (isImported ? 1 : 0);
        return result;
    }
}
