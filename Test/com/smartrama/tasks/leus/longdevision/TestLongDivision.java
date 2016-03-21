package com.smartrama.tasks.leus.longdevision;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLongDivision {

    @Test
    public void testDiviserEquelsZero() {
        long inputDividend = 0;
        long inputDiviser = 0;
        String expected = "diviser couldn't be equals zero!";
        division(inputDividend, inputDiviser, expected);
    }

    @Test
    public void testDiviserMoreThanDividend() {
        long inputDividend = 0;
        long inputDiviser = 1;
        String expected = "diviser more than dividend!";
        division(inputDividend, inputDiviser, expected);
    }

    @Test
    public void test100Dividend20Diviser() {
        long inputDividend = 100;
        long inputDiviser = 20;
        String expected = "diviser more than dividend!";
        division(inputDividend, inputDiviser, expected);
    }

    private void division(long dividend, long diviser, String expected) {
        LongDivision test = new LongDivision();

        assertEquals(test.getDivision(dividend,diviser), expected);

    }


}
