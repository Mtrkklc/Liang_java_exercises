package Liang.Chapter5;

import java.util.Locale;
import java.util.Scanner;

public class CountVowels_549 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string in English: ");
        String userString = input.nextLine().toUpperCase();
        String vowels = "AEIUO";

        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        for (int i = 0; i < userString.length(); i++) {
           char ch = userString.charAt(i);
           if(Character.isLetter(ch)){
               if(vowels.indexOf(ch) != -1){
                   numberOfVowels++;
               }else{
                   numberOfConsonants++;
               }
           }

        }
        System.out.println("The number of vowels: " + numberOfVowels);
        System.out.println("The number of consonants: " + numberOfConsonants);

    }
}
