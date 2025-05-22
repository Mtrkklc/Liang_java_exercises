package Liang.Chapter6;

import java.util.Scanner;

public class PrintTaxTable_615 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your current status: (0:single, 1:Married Filling Jointly, 2: Married filling seperately, 3: Head of Household)");
        int status = input.nextInt();
        System.out.println("Enter your Taxable Income: ");
        double income = input.nextDouble();
        double tax = 0;

        getTaxAmount(status, income);

    }

    private static void getTaxAmount(int status, double income) {
        double tax;
        switch (status) {
            case 0:
                tax = getSingleTax(income);
                System.out.println("Tax that you need to pay: " + tax);break;
            case 1:
                tax = getMarriedFillingJointlyTax(income);
                System.out.println("Tax that you need to pay: " + tax);break;
            case 2:
                tax = getMarriedFillingSeperatelyTax(income);
                System.out.println("Tax that you need to pay: " + tax);break;
            case 3:
                tax = getHeadOfHouseholdTax(income);
                System.out.println("Tax that you need to pay: " + tax);break;
        }
    }


    public static double getSingleTax(double taxableIncome) {
        double taxRate;
        double totalTax = 0;

        if (taxableIncome <= 8350) {
            totalTax = taxableIncome * 0.10;
        } else if (taxableIncome <= 33950) {
            totalTax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
        } else if (taxableIncome <= 82250) {
            totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
        } else if (taxableIncome <= 171550) {
            totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
        } else if (taxableIncome <= 372950) {
            totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (taxableIncome - 171550) * 0.33;
        } else {
            totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        return totalTax;
    }

    public static double getMarriedFillingJointlyTax(double taxableIncome) {
        double taxRate;
        double totalTax = 0;

        if (taxableIncome <= 16700) {
            totalTax = taxableIncome * 0.10;
        } else if (taxableIncome <= 67900) {
            totalTax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
        } else if (taxableIncome <= 137500) {
            totalTax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
        } else if (taxableIncome <= 208580) {
            totalTax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137500 - 67900) * 0.25 + (taxableIncome - 137500) * 0.28;
        } else if (taxableIncome <= 372950) {
            totalTax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137500 - 67900) * 0.25 + (208850 - 137500) * 0.28 + (taxableIncome - 208850) * 0.33;
        } else {
            totalTax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137500 - 67900) * 0.25 + (208850 - 137500) * 0.28 + (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        return totalTax;
    }

    public static double getMarriedFillingSeperatelyTax(double taxableIncome) {
        double taxRate;
        double totalTax = 0;

        if (taxableIncome <= 8350) {
            totalTax = taxableIncome * 0.10;
        } else if (taxableIncome <= 33950) {
            totalTax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
        } else if (taxableIncome <= 68525) {
            totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
        } else if (taxableIncome <= 104425) {
            totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
        } else if (taxableIncome <= 186475) {
            totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (taxableIncome - 104425) * 0.33;
        } else {
            totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
        }
        return totalTax;

    }

    public static double getHeadOfHouseholdTax(double taxableIncome) {
        double taxRate;
        double totalTax = 0;

        if (taxableIncome <= 11950) {
            totalTax = taxableIncome * 0.10;
        } else if (taxableIncome <= 45500) {
            totalTax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
        } else if (taxableIncome <= 117450) {
            totalTax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
        } else if (taxableIncome <= 190200) {
            totalTax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
        } else if (taxableIncome <= 372950) {
            totalTax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (taxableIncome - 190200) * 0.33;
        } else {
            totalTax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        return totalTax;

    }


}
