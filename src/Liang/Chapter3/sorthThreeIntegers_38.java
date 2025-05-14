package Liang.Chapter3;

import java.util.Scanner;

public class sorthThreeIntegers_38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        int a = input.nextInt();

        System.out.print("Lütfen 2. sayıyı giriniz: ");
        int b = input.nextInt();

        System.out.print("Lütfen 3. sayıyı giriniz: ");
        int c = input.nextInt();

        int temp = 0;

        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c){
            temp = a ;
            a = c;
            c= temp;
        }
        if (b > c){
            temp  = b;
            b = c;
            c = temp;
        }
        System.out.print("Sıralama " + a + " < " + b + " < " + c);

    }
}
