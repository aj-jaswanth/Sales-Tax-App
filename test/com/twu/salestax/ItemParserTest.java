package com.twu.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemParserTest {

    @Test
    public void shouldParseGivenImportedItemDescriptionWithBasicSalesTaxApplicalble() {
        Item actualItem = ItemParser.parse("1 imported bottle of perfume at 47.50");

        Item expectedItem = new Item("1 imported bottle of perfume", 1, 47.50, true, true);

        assertEquals(expectedItem, actualItem);
    }

    @Test
    public void shouldParseGivenItemDescriptionWithBasicSalesTaxNotApplicable() {
        Item actualItem = ItemParser.parse("1 packet of headache pills at 9.75");

        Item expectedItem = new Item("1 packet of headache pills", 1, 9.75, false, false);

        assertEquals(expectedItem, actualItem);
    }
}
