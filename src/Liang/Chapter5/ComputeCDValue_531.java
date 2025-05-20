package Liang.Chapter5;

import java.util.Scanner;

public class ComputeCDValue_531 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Amount of money: ");
        double amountOfMoney = input.nextDouble();

        System.out.print("Enter the annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();

        System.out.print("Enter the number of months: ");
        double numnberOfMonths = input.nextDouble();

        for (int i = 0; i < numnberOfMonths; i++) {
            amountOfMoney = amountOfMoney + (amountOfMoney*(annualPercentageYield/1200.0));
            System.out.print((i+1) + "." + " Month "  + " CD Value: ");
            System.out.printf("%-10.2f%n",amountOfMoney);
        }




    }
}
