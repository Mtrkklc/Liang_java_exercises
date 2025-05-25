package Liang.Chapter6;

import java.security.spec.RSAOtherPrimeInfo;

public class CreditCardNumberValidation_631 {
    public static void main(String[] args) {
        long invalid = 4388576018402626L;
        long valid = 4388576018410707L;

        if(isValid(invalid)){
            System.out.println(invalid + " is valid.");
        }else {
            System.out.println(invalid + "is invalid.");
        }

    }


    public static int getDigit(int number) {
        int constant = number * 2;

        if (constant < 10) {
            return constant;
        } else {
            int first = constant % 10;
            constant /= 10;
            return (first + constant);
        }


    }


    public static int sumOfDoubleEvenPlace(long number) {
        long division = 0;
        int sum = 0;


        for (int i = 0; i < 8; i++) {
            division = number % 100;
            division /= 10;
            sum += getDigit((int) division);
            number /= 100;

        }
        return sum;
    }


    public static int sumOfOddPlace(long number) {
        long division = 0;
        int sum = 0;

        for (int i = 0; i < 8; i++) {
            division = number % 10;
            number /= 100;
            sum += (int) division;
        }
        return sum;
    }

    public static boolean isValid(long number) {
        long sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (sum % 10 == 0);
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;


    }

    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);

        if (getSize(number) > k) {
            return Long.parseLong(numStr.substring(0, k));
        }
        return number;
    }


}
