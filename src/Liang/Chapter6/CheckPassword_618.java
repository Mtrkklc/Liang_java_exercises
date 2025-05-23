package Liang.Chapter6;

import java.util.Scanner;

public class CheckPassword_618 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter your password: ");
        String userPassword = input.nextLine();

        if(isValid(userPassword)){
            System.out.print("Your entered password is valid");
        }else{
            System.out.print("Invalid Password. Try again");
        }
    }

    public static boolean isValid(String enteredPassword) {
        int counter = 0;
        if (enteredPassword != null) {
            if (enteredPassword.length() < 8) {
                return false;
            } else {
                for (int i = 0; i < enteredPassword.length(); i++) {
                    if (!(Character.isDigit(enteredPassword.charAt(i)) || Character.isLetter(enteredPassword.charAt(i)))) {
                        return false;
                    }
                    if (Character.isDigit(enteredPassword.charAt(i))) {
                        counter++;

                    }
                }
                return counter >= 2;
            }
        } else {
            return false;
        }

    }
}
