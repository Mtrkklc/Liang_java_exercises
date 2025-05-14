package Liang.Chapter4;

import java.util.Scanner;

public class processAString_420 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir text giriniz: ");
        String isim = input.next();

        System.out.print(isim.length() + "\n");
        System.out.print(isim.charAt(0));
    }
}
