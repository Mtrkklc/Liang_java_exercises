package Liang.Chapter6;

import java.util.Scanner;

public class ApproximateTheSquareRoot_622 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        long number = input.nextLong();
        System.out.printf("Approximate square root of %2d is %.5f%n", number,root(number));

    }

    public static double root(long n) {
        double eplison = 0.000001;
        double guess = n/2;

        while ((Math.abs(guess * guess - n)) >= eplison) {
            guess = (guess + (n / guess)) / 2;
        }
        return guess;
    }
}
