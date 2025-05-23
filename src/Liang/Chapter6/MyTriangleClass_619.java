package Liang.Chapter6;

import java.util.Scanner;

public class MyTriangleClass_619 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle:  ");
        double side1 = input.nextDouble();

        System.out.print("Enter the second side of the triangle:  ");
        double side2 = input.nextDouble();

        System.out.print("Enter the third side of the triangle:  ");
        double side3 = input.nextDouble();
        if(isValid(side1,side2,side3)){
            System.out.print("Area of the triangle: " + area(side1,side2,side3));
        }else {
            System.out.print("Invalid input");
        }

    }
    public static boolean isValid(double side1, double side2, double side3){
        if((side1 + side2) < side3){
            return false;
        }else if((side1 + side3) < side2){
            return false;
        }else if((side2 + side3) < side1){
            return false;
        }
        return true;
    }
    public static double area(double side1, double side2,double side3){
        double area ;
        double semiParameter;
        semiParameter = (side1 + side2 + side3) / 2;

        area  =Math.sqrt(semiParameter*(semiParameter-side1)*(semiParameter-side2)*(semiParameter-side3));

        return area;
    }
}
