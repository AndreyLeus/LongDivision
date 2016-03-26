package com.smartrama.tasks.leus.longdevision;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLongDivision {

    @Test
    public void testDiviserEquelsZero() {
        long inputDividend = 0;
        long inputDiviser = 0;
        String expected = "diviser couldn't be equals zero!";
        division(expected, inputDividend, inputDiviser);
    }

    @Test
    public void testDiviserMoreThanDividend() {
        long inputDividend = 0;
        long inputDiviser = 1;
        String expected = "diviser more than dividend!";
        division(expected, inputDividend, inputDiviser);
    }

    @Test
    public void test10Dividend2Diveser() {
        long inputDividend = 10;
        long inputDiviser = 2;
        String expected =
                "_ 10 |_2_\n" +
                "  10 | 5\n" +
                "  __\n";
        division(expected, inputDividend, inputDiviser);
    }

    @Test
    public void test327678Dividend424Diviser() {
        long inputDividend = 327678;
        long inputDiviser = 424;
        String expected =
                "_ 327678 |_424_\n" +
                "  2968   | 772\n" +
                "  ______\n" +
                "   3087\n" +
                "   2968\n" +
                "   ____\n" +
                "    1198\n" +
                "    848\n" +
                "    ____\n" +
                "     350\n";
        division(expected, inputDividend, inputDiviser);
    }


    @Test
    public void test327678Dividend224Diviser() {
        long inputDividend = 327678;
        long inputDiviser = 224;
        String expected =
                "_ 327678 |_224_\n" +
                "  224    | 1462\n" +
                "  ______\n" +
                "   1036\n" +
                "   896\n" +
                "   ____\n" +
                "    1407\n" +
                "    1344\n" +
                "    ____\n" +
                "     638\n" +
                "     448\n" +
                "     ___\n" +
                "      190\n";
        division(expected, inputDividend, inputDiviser);
    }

    private void division(String expected, long dividend, long diviser) {
        LongDivision test = new LongDivision();

        assertEquals(expected, (test.getDivision(dividend, diviser)));
    }
}
