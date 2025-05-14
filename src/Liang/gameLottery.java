package Liang;

import java.util.Scanner;

public class gameLottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int) (100 + Math.random() * 900);

        System.out.println("Lottery number (test amaçlı): " + lottery);

        System.out.print("Lütfen 3 basamaklı bir sayı giriniz: ");
        int num = input.nextInt();

        int userBirler = num % 10;
        int userOnlar = (num / 10) % 10;
        int userYuzler = num / 100;

        int lotteryBirler = lottery % 10;
        int lotteryOnlar = (lottery / 10) % 10;
        int lotteryYuzler = lottery / 100;

        if (num == lottery) {
            System.out.println("Tebrikler 10000 dolar kazandınız.");
        } else if (
                (userBirler == lotteryBirler || userBirler == lotteryOnlar || userBirler == lotteryYuzler) &&
                        (userOnlar == lotteryBirler || userOnlar == lotteryOnlar || userOnlar == lotteryYuzler) &&
                        (userYuzler == lotteryBirler || userYuzler == lotteryOnlar || userYuzler == lotteryYuzler)
        ) {
            System.out.println("Tebrikler 3000 dolar kazandınız.");
        } else if (
                userBirler == lotteryBirler || userBirler == lotteryOnlar || userBirler == lotteryYuzler ||
                        userOnlar == lotteryBirler || userOnlar == lotteryOnlar || userOnlar == lotteryYuzler ||
                        userYuzler == lotteryBirler || userYuzler == lotteryOnlar || userYuzler == lotteryYuzler
        ) {
            System.out.println("Tebrikler 1000 dolar kazandınız.");
        } else {
            System.out.println("Maalesef kazanamadınız.");
        }
    }
}
