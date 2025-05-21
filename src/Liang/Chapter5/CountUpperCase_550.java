package Liang.Chapter5;

import java.util.Scanner;

public class CountUpperCase_550 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userString = input.nextLine();
        int numberOfUpperCase = 0;


        for (int i = 0; i < userString.length(); i++) {
            char letter = userString.charAt(i);
            if(Character.isLetter(letter)){
                if(Character.isUpperCase(letter)){
                    numberOfUpperCase++;
                }
            }

        }
        System.out.println("The number of uppercase letters is :  " + numberOfUpperCase);

    }
}
