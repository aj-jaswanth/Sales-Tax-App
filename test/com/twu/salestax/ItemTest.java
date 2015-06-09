package com.twu.salestax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void shouldComputeItsTotalCost() {
        Item item = new Item("1 imported bottle of perfume", 1, 10.0, false, true);

        double actualCost = item.totalCost();

        assertThat(actualCost, is(equalTo(10.50)));
    }

    @Test
    public void shouldComputeTotalSalesTaxApplied() {
        Item item = new Item("1 imported bottle of perfume", 1, 47.50, true, true);

        double actualSalesTaxApplied = item.totalSalesTaxApplied();

        assertThat(actualSalesTaxApplied, is(equalTo(7.125)));
    }

    @Test
    public void shouldReturnFalseWhenNullIsPassed() {
        Item object = new Item("", 1, 2, true, false);

        boolean actualEquality = object.equals(null);

        assertThat(actualEquality, is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseWhenOtherObjectIsPassed() {
        Item object = new Item("", 1, 2, true, false);

        boolean actualEquality = object.equals("");

        assertThat(actualEquality, is(equalTo(false)));
    }

    @Test
    public void reflexivePropertyOfEquality() {
        Item object = new Item("", 1, 2, true, false);

        assertEquals(object, object);
    }

    @Test
    public void symmetricPropertyOfEquality() {
        Item firstObject = new Item("", 1, 2, true, false);
        Item secondObject = new Item("", 1, 2, true, false);

        assertEquals(firstObject, secondObject);
    }

    @Test
    public void transitivePropertyOfEquality() {
        Item firstObject = new Item("", 1, 2, true, false);
        Item secondObject = new Item("", 1, 2, true, false);
        Item thirdObject = new Item("", 1, 2, true, false);

        assertEquals(firstObject, secondObject);
        assertEquals(secondObject, thirdObject);
        assertEquals(firstObject, thirdObject);
    }

    @Test
    public void ifTwoObjectsAreEqualThenTheirHashCodesAreSame() {
        Item firstObject = new Item("", 1, 2, true, false);
        Item secondObject = new Item("", 1, 2, true, false);

        boolean twoObjectsAreEqualThenTheirHashCodesAreSame = firstObject.equals(secondObject) && (firstObject.hashCode() == secondObject.hashCode());

        assertThat(twoObjectsAreEqualThenTheirHashCodesAreSame, is(equalTo(true)));
    }

    @Test
    public void ifTwoObjectsAreNotEqualThenTheirHashCodesAreNotSame() {
        Item firstObject = new Item("", 1, 2, true, false);
        Item secondObject = new Item("not same", 1, 2, true, false);

        boolean twoObjectsAreEqualThenHashCodesAreSame = firstObject.equals(secondObject) && (firstObject.hashCode() == secondObject.hashCode());

        assertThat(twoObjectsAreEqualThenHashCodesAreSame, is(equalTo(false)));
    }
}
