package Liang.Chapter7;

import java.util.Scanner;

public class PrintDistinctNumber_75 {
    public static void main(String[] args) {
        int[] numberList = new int[10];
        int[] distinctList = new int[10];
        Scanner input = new Scanner(System.in);
        int number;
        int distinct = 0;

        for (int i = 0; i < numberList.length; i++) {
            System.out.println("Enter an integer: ");
            number = input.nextInt();
            for (int j = 0; j < numberList.length; j++) {
                if (numberList[j] != number) {
                    numberList[j] = number;
                    distinct++;
                    distinctList[j] = number;
                    break;
                }
            }

        }

        for (int i = 0; i < distinctList.length; i++) {
            System.out.print(distinctList[i] + " ");
        }

    }

}
