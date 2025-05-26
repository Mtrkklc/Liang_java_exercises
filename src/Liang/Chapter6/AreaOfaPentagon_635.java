package Liang.Chapter6;

import java.util.Scanner;

public class AreaOfaPentagon_635 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.print("Area: " + area(side));


    }

    public static  double area(double side){
        return  ((5*(Math.pow(side,2))) / (4 * Math.tan(Math.PI/5)));
    }
}
