package Liang.Chapter5;

public class ComputePi_525 {
    public static void main(String[] args) {
        computePi(10_000);
        computePi(20_000);
        computePi(100_000);
    }

    public static void computePi(int terms) {
        double sum = 0;

        for (int i = 0; i < terms; i++) {
            double term = Math.pow(-1, i) / (2 * i + 1); // dönüşümlü pozitif-negatif
            sum += term;
        }

        double pi = 4 * sum;
        System.out.printf("Term sayısı: %-8d Hesaplanan π: %.15f\n", terms, pi);
    }
}
