package Liang.Chapter7;

import java.util.Scanner;

public class PrintDistinctNumber_75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNumbers = new int[10]; // En fazla 10 farklı sayı olabilir
        int count = 0; // Kaç farklı sayı olduğunu tutar

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();

            boolean isExist = false;

            for (int j = 0; j < count; j++) {
                if (distinctNumbers[j] == number) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                distinctNumbers[count] = number;
                count++;
            }

        }


        // Çıktılar
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
    }
}

