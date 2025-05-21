package Liang.Chapter5;

import java.util.Scanner;

public class ProcessString_548 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputString = input.nextLine();
        String oddPositionsString = "";

        for (int i = 0; i <inputString.length() ; i+=2) {
            char letter  = inputString.charAt(i);
            oddPositionsString +=letter;
        }
        System.out.println(oddPositionsString);
    }
}
