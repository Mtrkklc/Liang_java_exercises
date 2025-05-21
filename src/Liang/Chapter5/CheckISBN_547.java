package Liang.Chapter5;

import java.util.Scanner;

public class CheckISBN_547 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first 12 digits of an ISBN-13 as a string: ");
        String inputString = input.nextLine();
        int oddSum = 0;
        int evenSum = 0;

        if(inputString.length() != 12){
            System.out.println(inputString +" is an invalid input.");
        }else{
            for (int i = 0; i < 12; i++) {
                int digit = inputString.charAt(i) - '0';
                if (i % 2 == 0) {
                    oddSum += digit;
                } else {
                    evenSum += digit * 3;
                }
            }

            int lastChar = 10 - ((oddSum + evenSum) % 10);
            String lastCharString = Integer.toString(lastChar);

            if (lastChar == 10) {
                System.out.println(inputString + "0");
            } else {
                System.out.println(inputString + Integer.toString(lastChar));
            }
        }


    }
}
