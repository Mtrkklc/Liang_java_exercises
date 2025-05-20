package Liang.Chapter5;

import java.util.Scanner;

public class CompaundValue_530 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amount of Monthly Savings: ");
        double monthlySaving = input.nextDouble();
        System.out.print("Enter yearly interest rate: ");
        double yearlyInterestRate = input.nextDouble();
        System.out.print("Enter number of months: ");
        int numberOfMonth = input.nextInt();

        double futureValue=0;
        double monthlyInterestRate = yearlyInterestRate /12.0;


        for (int i = 0; i < 6; i++) {
            futureValue = (monthlySaving + futureValue) * (1 + monthlyInterestRate);
            System.out.printf("%-10.2f%n", futureValue);

        }


    }
}
