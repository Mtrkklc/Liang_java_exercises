package Liang.Chapter5;

import java.util.Scanner;

public class FindTheSalesAmount_539 {
    public static void main(String[] args) {
        double sales = 0;
        double comission;
        double goal = 25000;

        while (true){
            if (sales <= 5000){
                comission = sales * 0.08;
            }else if(sales<=1000){
                comission = 5000 * 0.08 + (sales-5000)*0.10;
            }else {
                comission = 5000 * 0.08 + 5000 * 0.10 + (sales-10000)*0.12;
            }
            if(comission >= goal){
                break;
            }
            sales += 0.01;
        }
        System.out.printf("Minimum sales to earn $30,000: $%.2f\n", sales);
    }
}

