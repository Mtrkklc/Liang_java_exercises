package Liang.Chapter5;

import java.util.Scanner;

public class OccuranceOfMaxNumber_541 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int max = 0;

        System.out.println("Enter the Positive Integer numbers: ");

        int numbers[] = new int[10];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter " + (i+1) + ". number: ");
            numbers[i] = input.nextInt();
        }
        max = numbers[0];

        for (int i = 0; i < (numbers.length-1); i++) {
            if(numbers[i]> max){
                max = numbers[i];
                counter = 1;
            }else if(numbers[i] == max){
                counter++;
            }
        }
        System.out.println("The Largest Number is: "+ max);
        System.out.println("The Occurence Count of the Largest Number is: "+ counter);







    }
}
