package Liang.Chapter5;

import java.util.Scanner;

public class FindTheFactorsInteger_516 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Positive Integer: ");
        int number = input.nextInt(); // 120 olsun
        boolean isOn = true;
        int division = 2;

        while (isOn){
            if (number % division == 0){
                number = number / division;
                System.out.printf("%-1d ",division);
            } else{
                division++;
            }
            if(number < division){
                isOn=false;
            }
        }
    }
}
