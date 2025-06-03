package Liang.Chapter7;

import java.util.Scanner;

public class StatisticsComputeDeviation_711 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        double[] x = new double[10];

        for (int i = 0; i < 10; i++) {
            x[i] = input.nextDouble();
        }

        double mean = mean(x);
        double deviation = deviation(x);

        System.out.println("The mean is: " + mean);
        System.out.println("The deviation is: " + deviation);

    }

    public static double deviation(double[] x){
        double deviation = 0;
        double mean = mean(x);
        double sumPow = 0;

        for (int i = 0; i < x.length; i++) {
            sumPow += Math.pow((x[i]- mean),2);
        }
        deviation = Math.sqrt(sumPow / (x.length-1));

        return deviation;
    }

    public static double mean (double[] x){
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return (sum / x.length);
    }
}
