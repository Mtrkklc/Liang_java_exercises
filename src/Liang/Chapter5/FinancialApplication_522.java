package Liang.Chapter5;

import java.util.Scanner;

public class FinancialApplication_522 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Enter Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Enter Annual Interest Rate: ");
        int annualInterestRate = input.nextInt();


        double monthlyInterestRate = annualInterestRate/1200.0;
        double monthlyPayment = (loanAmount*monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -(numberOfYears * 12)));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        double balance = loanAmount;


        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);

        System.out.printf("%-10s\t%-10s\t%-10s\t%-10s","Payment#","Interest","Principal","Balance");
        System.out.println();

        for (int i = 1; i <=12 ; i++) {
           double interest = balance * monthlyInterestRate;
           double principal = monthlyPayment - interest;
           balance-=principal;
           System.out.printf("%-10d\t%-10.2f\t%-10.2f\t%-10.2f",i,interest,principal,balance);
           System.out.println();

        }


    }
}
