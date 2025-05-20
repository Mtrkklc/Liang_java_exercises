package Liang.Chapter5;

import java.util.Scanner;

public class ComputerArchitecture_544 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = input.nextInt();
        String binary = "";
        boolean isOn = true;

        if(number == 0){
            System.out.println("binary: 0");
        }

        while(number > 0) {
            int kalan = number%2;
            number = number/2;
            binary = kalan + binary;
        }

        String paddedBinary = String.format("%16s",binary).replace(' ', '0');

        System.out.println("Binary (raw): " + binary);
        System.out.println("Binary (16-bit): " + paddedBinary);

    }

}
