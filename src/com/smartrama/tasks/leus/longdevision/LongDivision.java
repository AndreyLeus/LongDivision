package com.smartrama.tasks.leus.longdevision;

import java.util.Map;
import java.util.TreeMap;


public class LongDivision {

    public static void main(String[] args) {
        LongDivision retro = new LongDivision();
        System.out.println(retro.getDivision(327678,224));
    }

    private String result = "";
    int keysContainerResult = 1;
    TreeMap<Integer, String> containerResult = new TreeMap<Integer, String>();
    int[] containerDigitalsFromDividend;

    public String getDivision(long dividend, long diviser) {

        if (!checkDividentMoreThanDiviser(dividend,diviser)) {
            return "diviser more than dividend!";
        }

        if (!checkDiviserIsNotZero(diviser)) {
            return "diviser couldn't be equals zero!";
        }

        containerResult.put(keysContainerResult, "_ " + dividend + " |_" + diviser + "_");
        keysContainerResult++;

        transferDividendToArray(dividend);

        containerResult.put(keysContainerResult, retro(containerDigitalsFromDividend, diviser));
            keysContainerResult++;




        for (Map.Entry entry : containerResult.entrySet()) {
            System.out.println(entry.getValue());
            }




        return result;
    }

    private String retro(int[] containerDigitalsFromDividend, long diviser) {
        String result = "";
        for (int i = 0; i < (Long.toString(diviser)).length() ; i++) {
            result += containerDigitalsFromDividend[i];
        }

        System.out.println(result);


        return "";
    }

    private void transferDividendToArray(long dividend) {

        int lengthContainerDigitals = String.valueOf(dividend).length();
        containerDigitalsFromDividend = new int [lengthContainerDigitals];

        int j = lengthContainerDigitals -1;
        do {
            containerDigitalsFromDividend[j] = (int) (dividend % 10);
            dividend /= 10;
            j--;
        } while (dividend != 0);
    }

    private boolean checkDiviserIsNotZero(long diviser) {
        return diviser != 0;
    }

    private boolean checkDividentMoreThanDiviser(long dividend, long diviser) {
        return dividend >= diviser;
    }
}


/*
try {
            a = sc.nextInt();
            m[a-1] = 4/a;
            System.out.println(m[a]);
        } catch (ArithmeticException e) {
            System.out.println("Произошла недопустимая арифметическая операция");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение по недопустимому индексу массива");
        } catch (Exception e) {
            System.out.println("Произошло ещё какое-то исключение");
        }
    }
}
 */