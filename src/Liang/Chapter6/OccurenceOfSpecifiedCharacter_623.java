package Liang.Chapter6;

import java.util.Scanner;

public class OccurenceOfSpecifiedCharacter_623 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String word = input.nextLine().toLowerCase();

        System.out.print("Enter Char value: ");
        char ch = input.next().toLowerCase().charAt(0);

        System.out.println("Count of " + ch + " " + count(word, ch));




    }
    public static int count(String str, char a){
        int counter  = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a){
                counter++;
            }
        }
        return counter;
    }
}
