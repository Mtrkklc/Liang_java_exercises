package Liang.Chapter2;

import java.util.Scanner;

public class populationProject_211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentPopulation = 312032486;

        double gunlukSaniye = (24*60*60);
        double gunlukDogum =  gunlukSaniye / 7.0 ;
        double gunlukOlum = gunlukSaniye / 13.0;
        double gunlukMulteci = gunlukSaniye / 45.0;

        int yillikDogum = (int) (365 * gunlukDogum) ;
        int yillikOlum = (int) (365 * gunlukOlum) ;
        int yillikMulteci = (int) (365 * gunlukMulteci) ;

        System.out.print("Lütfen yıl bilgisi giriniz: ");
        int numberOfYears = input.nextInt();

        for (int i = 1; i <= numberOfYears; i++) {

            int yillikNufusDegisimi = yillikDogum + yillikMulteci - yillikOlum ;
            currentPopulation += yillikNufusDegisimi;

        }
        System.out.print(numberOfYears+" yıl sonundaki nüfus: " + currentPopulation + "\n");


    }
}
