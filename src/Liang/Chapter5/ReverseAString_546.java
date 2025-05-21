package Liang.Chapter5;

import java.util.Scanner;

public class ReverseAString_546 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a String to make it reverse: ");
        String word = input.nextLine();
        String reversedString = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversedString += word.charAt(i);
        }
        System.out.println("The reversed string is: " + reversedString);



    }
}

/*
 char[] wordArray = word.toCharArray();

        for (int i = word.length()-1; i >= 0 ; i--) {
            char letter = wordArray[i];
            reverse += letter;
        }
        System.out.println("Reversed String is: " + reverse);
 */