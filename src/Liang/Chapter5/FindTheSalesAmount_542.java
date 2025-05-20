package Liang.Chapter5;

import java.util.Scanner;

public class FindTheSalesAmount_542 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hedef komisyon miktarını gir: ");
        double goal = input.nextDouble();
        double commission = 0;

        double sales;


        for (sales = 0.01; ; sales += 0.01) {
            if (sales <= 5000) {
                commission = sales * 0.08;
            } else if (sales <= 10000) {
                commission = 5000 * 0.08 + (sales - 5000) * 0.10;
            } else {
                commission = 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
            }

            if (commission >= goal) {
                break;
            }
        }

        System.out.printf("Hedeflenen $%.2f komisyon için gereken minimum satış: $%.2f\n", goal, sales);
    }
}
