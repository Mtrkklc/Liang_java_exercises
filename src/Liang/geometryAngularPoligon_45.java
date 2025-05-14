package Liang;

import java.util.Scanner;

public class geometryAngularPoligon_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides:  ");
        int sides = input.nextInt();
        System.out.print("Enter the length of sides:  ");
        double lengthOfSides = input.nextDouble();

        double area = (sides * (Math.pow(lengthOfSides,2.0))) / (4.0 * (Math.tan(Math.PI / sides)));

        System.out.print("The area of the polygon is: " + area);
    }
}
