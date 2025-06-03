package Liang.Chapter7;

import java.util.Scanner;

public class FindTheIndexOfSmallestNumber_710 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Lütfen sayı giriniz: ");
            array[i] = input.nextDouble();
        }
        int smallestIndex = indexOfSmallestElement(array);
        System.out.println("Smallest number's Index: " + smallestIndex);


    }

    public static int indexOfSmallestElement(double[] array) {
        int smallestIndex = 0;
        double min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
