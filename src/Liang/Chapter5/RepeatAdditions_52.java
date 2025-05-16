package Liang.Chapter5;

import java.util.Scanner;

public class RepeatAdditions_52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        boolean isOn = true;
        long startTime = System.currentTimeMillis() / 1000;


        while (isOn) {
            System.out.print("Lütfen 1-15 arasında bir sayı giriniz: ");
            int sayi = input.nextInt();
            if(sayi < 1 || sayi > 15){
                System.out.println("Lütfen geçerli bir sayı giriniz. ");
            }else{
                count++;
            }
            if(count == 10){
                isOn = false;
            }

        }

        long finishTime = System.currentTimeMillis() / 1000;

        long elapsedTime = (finishTime - startTime);
        System.out.println("Girilen sayı miktarı: " + count);
        System.out.println("Geçen Süre: " + elapsedTime);

    }
}
