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
    public void testNegativDividendPositiveDiveser() {
        long inputDividend = -100;
        long inputDiviser = 2;
        String expected =
                "entered numbers must be positive";
        division(expected, inputDividend, inputDiviser);
    }


    @Test
    public void test_10_Dividend_10_Diveser() {
        long inputDividend = 10;
        long inputDiviser = 10;
        String expected =
                                "_10|_10_\n" +
                                " 10| 1\n";
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
    public void test100Dividend2Diveser() {
        long inputDividend = 100;
        long inputDiviser = 2;
        String expected =
                        "_ 100 |_2_\n" +
                        "  10  | 50\n" +
                        "  ___\n" +
                        "   0\n" +
                        "   0\n" +
                        "   _\n";
        division(expected, inputDividend, inputDiviser);
    }

    @Test
    public void test1000Dividend3Diveser() {
        long inputDividend = 1000;
        long inputDiviser = 3;
        String expected =
                        "_ 1000 |_3_\n" +
                        "  9   | 333\n" +
                        "  ____\n" +
                        "   10\n" +
                        "   9\n" +
                        "   __\n" +
                        "    10\n" +
                        "    9\n" +
                        "    __\n" +
                        "     1\n";
        division(expected, inputDividend, inputDiviser);
    }

    @Test
    public void test327678Dividend2Diviser() {
        long inputDividend = 327678;
        long inputDiviser = 2;
        String expected =
                        "_ 327678 |_2_\n" +
                        "  2      | 163839\n" +
                        "  ______\n" +
                        "   12\n" +
                        "   12\n" +
                        "   __\n" +
                        "    7\n" +
                        "    6\n" +
                        "    _\n" +
                        "     16\n" +
                        "     16\n" +
                        "     __\n" +
                        "      7\n" +
                        "      6\n" +
                        "      _\n" +
                        "       18\n" +
                        "       18\n" +
                        "       __\n";
        division(expected, inputDividend, inputDiviser);
    }

        @Test
    public void test327678Dividend24Diviser() {
        long inputDividend = 327678;
        long inputDiviser = 24;
        String expected =
                         "_ 327678 |_24_\n" +
                        "  24     | 13653\n" +
                        "  ______\n" +
                        "   87\n" +
                        "   72\n" +
                        "   __\n" +
                        "    156\n" +
                        "    144\n" +
                        "    ___\n" +
                        "     127\n" +
                        "     120\n" +
                        "     ___\n" +
                        "      78\n" +
                        "      72\n" +
                        "      __\n" +
                        "       6\n";
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

    @Test
    public void test327678Dividend9224Diviser() {
        long inputDividend = 327678;
        long inputDiviser = 9224;
        String expected =
                        "_ 327678 |_9224_\n" +
                        "  27672  | 35\n" +
                        "  ______\n" +
                        "   50958\n" +
                        "   46120\n" +
                        "   _____\n" +
                        "    4838\n";
        division(expected, inputDividend, inputDiviser);
    }

    private void division(String expected, long dividend, long diviser) {
        LongDivision test = new LongDivision();

        assertEquals(expected, (test.getDivision(dividend, diviser)));
    }
}
