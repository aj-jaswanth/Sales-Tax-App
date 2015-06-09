package com.twu.salestax;

import java.util.HashSet;
import java.util.Set;

public class ItemParser {

    private static Set<String> set = new HashSet<>();

    static {
        set.add("chocolate");
        set.add("book");
    }

    public static Item parse(String itemDetails) {
        String[] splitDetails = itemDetails.split(" ");
        int length = splitDetails.length;
        int quantity = Integer.parseInt(splitDetails[0]);
        double cost = Double.parseDouble(splitDetails[length - 1]);
        boolean basicSalesTaxApplicable = true;
        boolean importSalesTaxApplicable = false;
        for (int x = 1; x < length - 2; x++) {
            if (splitDetails[x].startsWith("import"))
                importSalesTaxApplicable = true;
            if (set.contains(splitDetails[x]))
                basicSalesTaxApplicable = false;
        }
        return new Item(itemDetails.substring(0, itemDetails.lastIndexOf("at") - 1), quantity, cost, basicSalesTaxApplicable, importSalesTaxApplicable);
    }
}