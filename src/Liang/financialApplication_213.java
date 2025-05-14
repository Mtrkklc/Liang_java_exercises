package Liang;

import java.util.Scanner;

public class financialApplication_213 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Aylık saving gir: ");
        double monthlySavings = input.nextDouble();
        double annualRate = 5;
        double monthlyRate = (5.0 / 100)/12;

        double firstMonth = monthlySavings * (1 + monthlyRate);
        double secondMonth = (firstMonth + monthlySavings) * (1 + monthlyRate);
        double thirdMonth = (secondMonth + monthlySavings) * (1 + monthlyRate);
        double forthMonth = (thirdMonth + monthlySavings) * (1 + monthlyRate);
        double fifthMonth = (forthMonth + monthlySavings) * (1 + monthlyRate);
        double sixthMonth = (fifthMonth + monthlySavings) * (1 + monthlyRate);

        System.out.printf("%.2f",sixthMonth);
    }
}
