package Liang.Chapter6;

import java.util.Scanner;

public class ComputeTheFutureInvestment_67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 9 for 9%): ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;


        System.out.printf("%-6s%-20s\n", "Years", "Future Value");


        printInvestmentValue(investmentAmount, monthlyInterestRate);
    }

    public static void printInvestmentValue(double investmentAmount, double monthlyInterestRate) {
        for (int year = 1; year <= 30; year++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, year);
            System.out.printf("%-6d$%-20.2f\n", year, futureValue);
        }
    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
