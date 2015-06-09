package com.twu.salestax;

import java.util.HashMap;
import java.util.Map;

public class ItemParser {
    static {

    }

    private Map<String, String> map = new HashMap<>();


    public static Item parse(String itemDetails) {
        String[] splitDetails = itemDetails.split(" ");
        int length = splitDetails.length;
        int quantity = Integer.parseInt(splitDetails[0]);
        double cost = Double.parseDouble(splitDetails[length - 1]);
        boolean basicSalesTaxApplicable = true;
        boolean importSalesTaxApplicable = true;


        return new Item(itemDetails, quantity, cost, basicSalesTaxApplicable, importSalesTaxApplicable);
    }
}
