package Liang.Chapter5;

import java.util.Scanner;

public class PerfectNumber_533 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer number:  ");
        int number = input.nextInt();

        int total = 0;

        for (int i = 1; i <= (number/2) ; i++) {
            if(number % i == 0){
                total += i;
            }
        }
        if(total == number)
        {
            System.out.println(number + " is a perfect number.");
        }else{
            System.out.println(number + " is NOT a perfect number.");
        }





    }
}
