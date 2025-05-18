package Liang.Chapter5;

public class SumaSeries_524 {
    public static void main(String[] args) {
        double result = 0;

        for (double i = 1; i <=97 ; i+=2) {
            double payda = i +2;
            result += i/(payda);
        }
        System.out.println("Toplam: " + result);
    }
}
