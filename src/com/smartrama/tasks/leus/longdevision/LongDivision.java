package com.smartrama.tasks.leus.longdevision;

public class LongDivision {

    private String result = "";
    int countOfLines = 1;
    int[] containerDigitalsFromDividend;
    long preIntermediateDividend;
    long intermediateDividend;

    public String getDivision(long dividend, long diviser) {

        if (!checkDividentMoreThanDiviser(dividend,diviser)) {
            return "diviser more than dividend!";
        }

        if (!checkDiviserIsNotZero(diviser)) {
            return "diviser couldn't be equals zero!";
        }

        outFirstLine(dividend, diviser);

        transferDividendToArrayOfDigitals(dividend);

        outSecondLine(dividend, diviser);


        while (containerDigitalsFromDividend.length > 0) {
            outOtherLines(diviser);
        }

        printLastLine();


        return result;
    }

    private void outFirstLine(long dividend, long diviser) {
        result = "_ " + dividend + " |_" + diviser + "_" + "\n" ;
        countOfLines++;
    }

    private void transferDividendToArrayOfDigitals(long dividend) {

        int lengthDividend = String.valueOf(dividend).length();
        int lengthContainerDigitals = lengthDividend;
        containerDigitalsFromDividend = new int [lengthContainerDigitals];

        int j = lengthContainerDigitals-1;
        do {
            containerDigitalsFromDividend[j] = (int) (dividend % 10);
            dividend /= 10;
            j--;
        } while (dividend != 0);
    }

    private void outSecondLine(long dividend, long diviser) {

        preIntermediateDividend = Long.parseLong(getShortDividend(diviser));
        // получаем первое делимое, равный кол-ву цифр в делителе
        changeContainerDigitalsFromDividend((String.valueOf(preIntermediateDividend).length()));

        if (preIntermediateDividend > diviser) { // если первое делимое больше делителя, то печатаем вторую строку

            intermediateDividend = difference(preIntermediateDividend,diviser);

            result += "  " + intermediateDividend + spaces(dividend, preIntermediateDividend) + " | "
                    + (dividend / diviser) + "\n" +(underline(dividend)) + "\n";
            countOfLines++;

        } else { // иначе добавляем в первый делитель еще одну цифру

            preIntermediateDividend = Long.parseLong(getShortDividendAddOneDigital(preIntermediateDividend));
            changeContainerDigitalsFromDividend(1);

            intermediateDividend = difference(preIntermediateDividend,diviser);

            result += "  " + intermediateDividend + spaces(dividend, preIntermediateDividend) + " | "
                    + dividend / diviser + "\n" +(underline(dividend))+ "\n";;
            countOfLines++;
        }
    }

    private void outOtherLines(long diviser) {
        long value = 0;

        value = preIntermediateDividend - intermediateDividend;

        value = Long.parseLong(getShortDividendAddOneDigital(value));

        preIntermediateDividend = value;

        changeContainerDigitalsFromDividend(1);

        intermediateDividend = difference(preIntermediateDividend,diviser);

        printForOtherLines();
    }

    private void printLastLine() {
        if (preIntermediateDividend != intermediateDividend){
            result += spaces() + (preIntermediateDividend-intermediateDividend) + "\n";
        }
    }

    private void printForOtherLines() {
        result += (spaces() + preIntermediateDividend) + "\n" +spaces() + intermediateDividend
                + "\n" + underline(preIntermediateDividend) + "\n";
        countOfLines++;
    }
    // метод печaти в консоль

    private String spaces() {
        String resultLocal = "";
        for (int i = 0; i < countOfLines ; i++) {
            resultLocal += " ";
        }
        return resultLocal;
    }

    private String getShortDividendAddOneDigital(long number) {

        String resultLocal = "";
        if (number != 0) {
            resultLocal = String.valueOf(number);
            resultLocal += containerDigitalsFromDividend[0];
        } else {
            resultLocal = String.valueOf(containerDigitalsFromDividend[0]);
        }
        return resultLocal;
    }
    // получаем стоку с добавленной одной цифрой из массива

    private long difference (long dividend, long diviser) {
        int i = 1;
        for (; i <9 ; i++) {
            if ((dividend - diviser*i)<0){
                break;
            }
        }
        intermediateDividend = dividend-(dividend - diviser*(i-1));
        return intermediateDividend;
    }
    // возвращает разницу между preintermediateDividend и intermediateDividend

    private String spaces(long dividend, long firstDividend) {
        String resultLocal = "";
        for (int i = 0; i <(String.valueOf(dividend).length() - String.valueOf(firstDividend).length()) ; i++) {
            resultLocal += " ";
        }
        return resultLocal;
    }
    // метод печатающий пробелы

    private String underline (long dividend) {
        String resultLocal = "";
        for (int i = 0; i <countOfLines ; i++) {
            resultLocal += " ";
        }

        for (int i = 0; i <(String.valueOf(dividend).length()) ; i++) {
            resultLocal += "_";
        }
        return resultLocal;
    }
    // метод печатающий подчеркивание

    private String getShortDividend(long diviser) {
        // получаем строку из массива = кол-ву цифр в делителе
        String resultLocal = "";
        int i = 0;
        for (; i < (Long.toString(diviser)).length() ; i++) {
            resultLocal += containerDigitalsFromDividend[i];
        }
        preIntermediateDividend = Long.parseLong(resultLocal);
        return resultLocal;
    }
    // получаем строку из массива = кол-ву цифр в делителе // preIntermediateDividend = Long.parseLong(result);

    private void changeContainerDigitalsFromDividend( int i) {
        int [] temp = containerDigitalsFromDividend.clone();
        containerDigitalsFromDividend = new int[temp.length-i];
        System.arraycopy(temp, i, containerDigitalsFromDividend, 0, temp.length-i);
    }
    // меняем массив, удаляя c позиции i

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
        } catch (Exception e) {
            System.out.println("Произошло ещё какое-то исключение");
        }
    }
}
 */