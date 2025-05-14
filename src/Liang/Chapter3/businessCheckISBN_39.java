package Liang.Chapter3;

import java.util.Scanner;

public class businessCheckISBN_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN number as integer: ");
        int isbn = input.nextInt();
        int checkSum = 0;
        int isbnMod, lastDigit;
        int temp = 0;
        int firstDigit = 1;
        temp = isbn;

        for (int i=9; i>0; i--){
           isbnMod = temp % 10;
           checkSum += (isbnMod * i);
           temp /= 10;
           if (i == 1){
               firstDigit = isbnMod *i;
           }
        }
        lastDigit = checkSum % 11;

        if (firstDigit == 0){
            if (lastDigit == 10) {
                System.out.print("The ISBN-10 number is: "+ "0" + isbn + "X");
            }else {
                System.out.printf("The ISBN-10 number is: " + "0" + isbn +"" +lastDigit);
            }
        } else {
            if (lastDigit == 10) {
                System.out.print("The ISBN-10 number is: " + isbn + "X");
            }else {
                System.out.printf("The ISBN-10 number is: "+ isbn +"" +lastDigit);
            }
        }



    }

}
