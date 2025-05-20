package Liang.Chapter5;

import java.util.Scanner;

public class DecimalToOctal_538 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value: ");
        int decimalValue = input.nextInt();
        String octal = "";

        if(decimalValue == 0){
            System.out.print("Decimal: " + 0);
        }
        while(decimalValue > 0){
            int kalan = decimalValue % 8;
            octal = kalan + octal;
            decimalValue /= 8;
        }
        System.out.print("Octal Value: " + octal);
    }
}
