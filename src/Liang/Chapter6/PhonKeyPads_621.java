package Liang.Chapter6;

import java.util.Scanner;

public class PhonKeyPads_621 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your phone number(Can contain a letter or Whole string): ");
        String phoneNumber  = input.nextLine();
        String correctedNumber = "";

        for (int i = 0; i < phoneNumber.length(); i++) {
            if(Character.isLetter(phoneNumber.charAt(i))){
                correctedNumber += getNumber(phoneNumber.charAt(i));
            }
            if(Character.isDigit(phoneNumber.charAt(i))){
                correctedNumber += phoneNumber.charAt(i);
            }
        }
        System.out.print("Phone Number: " + correctedNumber);

    }

    public static int getNumber(char uppercaseLetter) {
        char lowercase ;
        if(Character.isUpperCase(uppercaseLetter)){
            lowercase = Character.toLowerCase(uppercaseLetter);
            return phoneKeypads(lowercase);
        }else {
            return phoneKeypads(uppercaseLetter);
        }

    }

    public static int phoneKeypads(char letter) {
        if (letter == 'a' || letter == 'b' || letter == 'c') {
            return 2;
        } else if (letter == 'd' || letter == 'e' || letter == 'f') {
            return 3;
        } else if (letter == 'g' || letter == 'h' || letter == 'i') {
            return 4;
        } else if (letter == 'j' || letter == 'k' || letter == 'l') {
            return 5;
        } else if (letter == 'm' || letter == 'n' || letter == 'o') {
            return 6;
        } else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's') {
            return 7;
        } else if (letter == 't' || letter == 'u' || letter == 'v') {
            return 8;
        } else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') {
            return 9;
        }
        return 0;

    }
}
