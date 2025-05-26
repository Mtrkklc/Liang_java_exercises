package Liang.Chapter7;

import java.util.Scanner;

public class CountOccurenceOfNumber_73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz? ");
        int n = input.nextInt();

        int[] counts = new int[101]; // 1–100 arası sayılar için index 1–100 kullanılacak

        System.out.println("Lütfen 1 ile 100 arasında " + n + " sayı giriniz:");

        for (int i = 0; i < n; i++) {
            int number = input.nextInt();

            if (number >= 1 && number <= 100) {
                counts[number]++;
            } else {
                System.out.println("Geçersiz sayı! 1 ile 100 arasında giriniz.");
                i--; // tekrar saymasını sağla
            }
        }

        System.out.println("\nTekrar Sayıları:");
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + (counts[i] == 1 ? " time" : " times"));
            }
        }
    }

}