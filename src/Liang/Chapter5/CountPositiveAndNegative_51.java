package Liang.Chapter5;

import java.util.Scanner;

public class CountPositiveAndNegative_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCounter = 0;
        int negativeCounter = 0;
        double total = 0;
        boolean is_on = true;


        while(is_on){
            System.out.print("Enter an integer, the input ends if it is 0: ");
            int sayi = input.nextInt();

            if (sayi == 0) {
                System.out.println("Program has been end.");
                is_on = false;
            }else if (sayi < 0){
                negativeCounter++;
                total += sayi;
            }else {
                positiveCounter++;
                total += sayi;
            }
        }

        double average = (total / (double) (negativeCounter + positiveCounter));
        System.out.printf("The total: %.2f \n", total);
        System.out.printf("The average: %.2f \n", average);

    }
}
