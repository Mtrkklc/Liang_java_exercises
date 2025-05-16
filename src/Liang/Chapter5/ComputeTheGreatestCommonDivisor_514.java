package Liang.Chapter5;

import java.util.Scanner;

public class ComputeTheGreatestCommonDivisor_514 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter an Positive Integer: ");
        int sayi1 = input.nextInt();
        System.out.print("Please Enter an Positive Integer: ");
        int sayi2 = input.nextInt();

        int max = 0;

        if(sayi1 < sayi2){
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        for (int i = 2; i <= (sayi2); i++) {
            if(sayi2 % i == 0 && sayi1 % i == 0){
                max  = i ;
            }
        }
        /*
        * Euclid Algoritması ile çözüm (Harika bir mantık)
          while (sayi2 !=0){
            int temp = sayi2;
            sayi2 = sayi1 % sayi2;
            sayi1 = temp;

        * */
        System.out.print("En büyük bölen: " + max);
    }
}
