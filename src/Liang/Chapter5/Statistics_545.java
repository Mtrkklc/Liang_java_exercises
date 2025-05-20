package Liang.Chapter5;

import java.util.Scanner;

public class Statistics_545 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum =0;
        double numbers[] = new double[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double mean = sum/numbers.length;

        double kareFarkToplam = 0;
        for (int i = 0; i < (numbers.length-1); i++) {
            kareFarkToplam += Math.pow(numbers[i] - mean, 2);
        }

        // Standart sapma (popülasyon için)
        double standartSapma = Math.sqrt(kareFarkToplam / numbers.length);

        // Sonuç
        System.out.printf("Ortalama: %.2f\n", mean);
        System.out.printf("Standart Sapma: %.2f\n", standartSapma);
    }
}
