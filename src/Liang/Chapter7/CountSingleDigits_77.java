package Liang.Chapter7;

public class CountSingleDigits_77 {
    public static void main(String[] args) {
        int[] randomIntegersCounter = new int[10];



        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 10);
            randomIntegersCounter[number]++;
        }
        for (int i = 0; i < randomIntegersCounter.length; i++) {
            System.out.println(i + " sayısı " + randomIntegersCounter[i] + " kez üretildi.");
        }


    }
}
