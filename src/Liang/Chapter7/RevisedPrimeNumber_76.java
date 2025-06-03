package Liang.Chapter7;

import java.util.Scanner;

public class RevisedPrimeNumber_76 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        int[] primeNumbers = new int[50];

        while (count < 50) {
            if (isPrime(number)) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }

        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%-6d", primeNumbers[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }




    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
