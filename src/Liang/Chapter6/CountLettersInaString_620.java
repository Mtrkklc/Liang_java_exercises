package Liang.Chapter6;

import java.util.Scanner;

public class CountLettersInaString_620 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = input.nextLine();

        int letterCount =  countLetters(sentence);
        System.out.print("Number of Letters in " + sentence + " is " + letterCount);

    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
