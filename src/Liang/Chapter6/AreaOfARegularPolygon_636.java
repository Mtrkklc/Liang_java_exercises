package Liang.Chapter6;

import java.util.Scanner;

public class AreaOfARegularPolygon_636 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        double side = input.nextDouble();

        System.out.print("Enter the number of side: ");
        int numberOfSide = input.nextInt();

        System.out.print("Area: " + area(numberOfSide,side));

    }
    public static  double area(int n, double side){
        return ((n*(Math.pow(side,2))) / (4 * Math.tan(Math.PI/n)));
    }
}
