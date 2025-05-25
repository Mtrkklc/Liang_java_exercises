package Liang.Chapter6;

public class Emirp_627 {
    public static void main(String[] args) {
        int number = 1;
        int counter = 0;


        while (true) {
            number++;
            int reversedNumber  = reversed(number);

            if (isPrime(number) && isPrime(reversed(number)) && number != reversedNumber) {
                counter++;
                System.out.printf("%-6d", number);

                if (counter % 10 == 0) {
                    System.out.println();
                }

                if (counter == 100) {
                    break;
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

    public static int reversed(int number) {
        int originalNumber = number;
        int division;
        int reverse = 0;

        while (number > 0) {
            division = number % 10;
            reverse = reverse * 10 + division;
            number /= 10;
        }

        return reverse;


    }


}
