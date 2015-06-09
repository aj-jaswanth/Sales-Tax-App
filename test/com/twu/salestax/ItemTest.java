package com.twu.salestax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void shouldComputeItsTotalCost() {
        Item item = new Item(10.0, false, true);

        double actualCost = item.totalCost();

        assertThat(actualCost, is(equalTo(10.50)));
    }

    @Test
    public void shouldComputeTotalSalesTaxApplied() {
        Item item = new Item(47.50, true, true);

        double actualSalesTaxApplied = item.totalSalesTaxApplied();

        assertThat(actualSalesTaxApplied, is(equalTo(7.125)));
    }
}
