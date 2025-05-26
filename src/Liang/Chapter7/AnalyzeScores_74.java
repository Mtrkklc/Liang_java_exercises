package Liang.Chapter7;

import java.util.Scanner;

public class AnalyzeScores_74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numberlist = new int[100];
        int i = 0;
        int sum = 0;
        int average = 0;

        while (true) {
            System.out.print("Enter an Integer: ");
            int number = input.nextInt();

            if (number < 0) {
                break;
            }
            numberlist[i] = number;
            sum += number;
            i++;
        }

        average = sum / (i);
        int countBelow = 0;
        int countEqual = 0;
        int countAbove = 0;

        System.out.println(sum);
        System.out.println(average);

        for (int j = 0; j < i; j++) {
            if(numberlist[j] < average){
                countBelow++;
            } else if (numberlist[j] == average) {
                countEqual++;
            }else {
                countAbove++;
            }
        }
        System.out.println(countAbove);
        System.out.println(countBelow);
        System.out.println(countEqual);

    }


}
