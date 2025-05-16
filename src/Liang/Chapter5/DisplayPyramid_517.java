package Liang.Chapter5;
import java.util.Scanner;


public class DisplayPyramid_517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (1–15): ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            // 1. Boşlukları yazdır (sağa kaydırmak için)
            for (int s = 1; s <= number - i; s++) {
                System.out.print("    x"); // 4 boşluk, hizalama için
            }

            // 2. Azalan sayılar (i'den 1'e)
            for (int j = i; j >= 1; j--) {
                System.out.printf("%4d", j);
            }

            // 3. Artan sayılar (2'den i'ye)
            for (int k = 2; k <= i; k++) {
                System.out.printf("%4d", k);
            }

            // 4. Satırı bitir
            System.out.println();
        }
    }
}
