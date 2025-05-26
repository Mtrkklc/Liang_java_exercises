package Liang.Chapter7;

import java.util.Scanner;

public class ReverseNumberEntered_72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] reversedNumbers = reversedArray(numbers);

        for (int reversedNumber : reversedNumbers) {
            System.out.println(reversedNumber);
        }


    }

    public static int[] reversedArray(int[] numbers) {
        int[] reversedNumbers = new int[10];

        for (int i = numbers.length-1, j = 0; i >= 0; i--, j++) {
            reversedNumbers[j] = numbers[i];
        }
        return reversedNumbers;
    }

}
