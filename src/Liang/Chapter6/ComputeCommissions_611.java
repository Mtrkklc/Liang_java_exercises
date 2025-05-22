package Liang.Chapter6;

public class ComputeCommissions_611 {
    public static void main(String[] args) {
        double salesAmount = 0;
        double baseSalary = 5000;
        double targetIncome = 25000;
        double commission = 0;

        while(baseSalary + commission < targetIncome){
            salesAmount+=0.01;
            commission = computeCommission(salesAmount);
        }

        System.out.printf("Minimum sales to earn $25,000 income: $%.2f%n", salesAmount);


        System.out.printf("%-15s%-15s%n", "Sales Amount", "Commission");
        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-15d%-15.2f%n", i, computeCommission(i));
        }


    }

    public static double computeCommission(double salesAmount) {
        double commission = 0;

        if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            commission = (5000 * 0.08) + ((salesAmount - 5000) * 0.10);
        } else {
            commission = (5000 * 0.08) + (5000 * 0.10) + ((salesAmount - 10000) * 0.12);
        }
        return commission;
    }


}

