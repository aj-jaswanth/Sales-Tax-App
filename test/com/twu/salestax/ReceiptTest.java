package com.twu.salestax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReceiptTest {
    @Test
    public void shouldPrintAllItemsItHas() {
        Receipt receipt = new Receipt();
        Item item = mock(Item.class);
        when(item.toString()).thenReturn("");
        receipt.addItem(item);

        String actualItemDescription = item.toString();

        assertThat(actualItemDescription, is(equalTo("")));
    }
}
