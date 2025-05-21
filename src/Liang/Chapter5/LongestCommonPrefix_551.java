package Liang.Chapter5;

import java.util.Scanner;

public class LongestCommonPrefix_551 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first a string: ");
        String firstString = input.nextLine();

        System.out.print("Enter the second a string: ");
        String secondString = input.nextLine();

        String commonPrefix = "";
        String shortString = "";

        if (firstString.length() > secondString.length()) {
            shortString = secondString;
        } else {
            shortString = firstString;
        }

        for (int i = 0, j = 0; i < shortString.length(); i++, j++) {
            char firstStringChar = firstString.charAt(i);
            char secondStringChar = secondString.charAt(j);

            if (firstStringChar == secondStringChar) {
                commonPrefix += firstStringChar;
            }else{
                System.out.print(firstString + " and " + secondString + " have no common prefix.");
                break;
            }

        }
        if(!commonPrefix.isEmpty()){
            System.out.print("The common prefix is: " + commonPrefix);
        }


    }
}
