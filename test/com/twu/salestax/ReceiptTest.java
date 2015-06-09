package com.twu.salestax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReceiptTest {
    @Test
    public void shouldDisplayTotalCostOfAllItems() {
        Receipt receipt = new Receipt();
        receipt.addItem("1 imported bottle of perfume at 47.50");

        String actualDescription = receipt.toString();

        assertThat(actualDescription, is(equalTo("1 imported bottle of perfume : 54.65")));
    }
}
