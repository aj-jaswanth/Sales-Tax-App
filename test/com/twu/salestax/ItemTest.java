package com.twu.salestax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void itemShouldBeAbleToComputeItsCost() {
        Item item = new Item("1 imported box of chocolates at 10.00");

        double actualCost = item.actualCost();

        assertThat(actualCost, is(equalTo(10.0)));
    }
}
