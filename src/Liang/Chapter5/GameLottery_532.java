package Liang.Chapter5;

public class GameLottery_532 {
    public static void main(String[] args) {

        int rassalSayi1 = (int) (Math.random()*10);
        int rassalSayi2;

        do {
            rassalSayi2 = (int) (Math.random()*10);

            System.out.println("1. Sayı: " + rassalSayi1);
            System.out.println("2. Sayı: " + rassalSayi2);

        }while(rassalSayi1 != rassalSayi2);

    }
}
