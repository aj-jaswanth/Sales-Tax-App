package com.twu.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemParserTest {

    @Test
    public void shouldParseGivenItemDescription() {
        Item actualItem = ItemParser.parse("1 imported bottle of perfume at 47.50");

        Item expectedItem = new Item("1 imported bottle of perfume at 47.50", 1, 47.50, true, true);

        assertEquals(expectedItem, actualItem);
    }
}
