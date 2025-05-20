package Liang.Chapter5;

public class Summation_535 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i < 626; i++) {
            sum += 1 /(Math.sqrt(i) + Math.sqrt((i+1)));
        }
        System.out.printf("Toplam Sonuç: %-4.2f", sum);
    }
}
