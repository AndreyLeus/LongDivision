package com.smartrama.tasks.leus.longdevision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 17.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long dividend = 0;
        long diviser = 0;
        try {
            dividend = Long.valueOf(reader.readLine());
            diviser = Long.valueOf(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        LongDivision anagramaForLineInput = new LongDivision();

        System.out.println("Dividend is " + dividend + ", diviser is " + diviser + ", the quotient is "
                + anagramaForLineInput.getDivision(dividend, diviser));
    }
}
