package Liang.Chapter5;

import java.util.Scanner;

public class Obeb {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int bolen = 2;
        int obeb = 1;

        while (bolen <= sayi1 && bolen <= sayi2){
            if (sayi1 % bolen == 0 && sayi2 % bolen == 0) {
                obeb = bolen;
            }
            bolen++;

        }
        System.out.print("OBEB: " + obeb);
    }
}
