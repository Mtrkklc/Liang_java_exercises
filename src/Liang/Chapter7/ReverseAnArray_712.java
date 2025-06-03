package Liang.Chapter7;

import java.util.Scanner;

public class ReverseAnArray_712 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }

        double[] reversedArray = reversedArray(array);

        for(double number : reversedArray){
            System.out.println(number);
        }

    }

    public static double[] reversedArray(double[] array){
        double[] reversedArray = new double[10];

        for (int i = 0,j = array.length-1; i < array.length ; i++, j--) {
            reversedArray[i] = array[j];
        }
        return reversedArray;
    }

}
