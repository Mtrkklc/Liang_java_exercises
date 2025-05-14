package Liang.Chapter4;

import java.util.Scanner;

public class financialApplicationPayroll_423 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Employee Name: ");
        String name = input.next();
        System.out.print("Enter the number of hours worked in a week: ");
        int numOfhours = input.nextInt();
        System.out.print("Enter the hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter the federal tax witholding rate: ");
        double federalTaxRate = input.nextDouble()*0.01;
        System.out.print("Enter the state tax witholding rate: ");
        double stateTaxRate = input.nextDouble()*0.01;

        double grossPay = payRate*numOfhours;
        double federalTax = federalTaxRate * grossPay;
        double stateTax = stateTaxRate * grossPay;
        double totalDeduction = federalTax + stateTax;
        double netPay = grossPay-totalDeduction;

        System.out.print("Employee Name: " + name + "\n");
        System.out.print("Hours Worked: " + numOfhours + "\n");
        System.out.print("Pay Rate: " + payRate + "\n");
        System.out.print("Gross Pay: " + (grossPay) + "\n");
        System.out.println("Deductions:");
        System.out.print("  Federal Witholding: " + "$" + federalTax + "\n");
        System.out.print("  State Witholding: " + "$" + stateTax + "\n");
        System.out.print("  TOTAL DEDUCTION: " + "$" + totalDeduction + "\n");
        System.out.printf("Net Pay: %.2f ",netPay);


    }
}
