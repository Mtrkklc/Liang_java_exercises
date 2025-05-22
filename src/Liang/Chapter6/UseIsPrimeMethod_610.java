package Liang.Chapter6;

public class UseIsPrimeMethod_610 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.printf("%-7d", i);
                counter++;

                if (counter % 10 == 0) {
                    System.out.println();
                }
            }

        }

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
