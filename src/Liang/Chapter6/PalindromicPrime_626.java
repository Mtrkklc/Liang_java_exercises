package Liang.Chapter6;

public class PalindromicPrime_626 {
    public static void main(String[] args) {

        int counter = 0;
        int number = 1;

        while(true){
            number++;

            if(isPalindromic(number) && isPrime(number)){
                counter++;
                System.out.printf("%-6d",number);

                if(counter %10 == 0){
                    System.out.println();
                }
                if(counter == 100){
                    break;
                }
            }


        }


    }

    public static boolean isPalindromic(int number) {
        int division;
        int original =  number;
        int reverse = 0;

        while (number > 0) {
            division = number % 10;
            reverse = reverse * 10 + division;
            number /= 10;

        }

        return original == reverse;

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
