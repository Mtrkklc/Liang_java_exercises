package Liang.Chapter5;

import java.util.Scanner;

public class FinancialApplication_521 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Enter Loan Years: ");
        int loanYears = input.nextInt();

        double yearlyInterestRateStart = 5;
        double yearlyInterestRateFinish = 8;
        double increment = 0.125;

        System.out.println("Yearly Interest rate\t " + " Monthly Payment\t " + " Total Payment ");

        for (double i = yearlyInterestRateStart; i <= yearlyInterestRateFinish ; i = i+0.125) {
            double monthlyInterestRate = i/1200;
            double monthlyPayment = (loanAmount*monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -(loanYears * 12)));
            double totalPayment = monthlyPayment * loanYears * 12;
            System.out.printf("%-6.3f\t\t\t\t\t%-6.2f\t\t\t\t\t%-6.2f\t\t\t\t\t",i, monthlyPayment, totalPayment);
            System.out.println();

        }

    }
}
