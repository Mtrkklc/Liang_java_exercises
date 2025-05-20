package Liang.Chapter5;

import java.util.Scanner;

public class DecimalToBinary_537{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a decimal integer: ");
    int decimal = input.nextInt();

    if (decimal == 0) {
      System.out.println("Binary: 0");
      return;
    }

    String binary = "";

    while (decimal > 0) {
      int kalan = decimal % 2;
      binary = kalan + binary;
      decimal /= 2;
    }
    System.out.println("Binary: " + binary);
  }
}
