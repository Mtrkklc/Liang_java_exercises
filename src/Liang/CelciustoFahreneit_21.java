package Liang;

import java.util.Scanner;

public class CelciustoFahreneit_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Celcius Degree: ");
        double celcius = input.nextDouble();
        double fahreneit =( 9.0 / 5 ) * celcius + 32;
        System.out.print("Celcius to Fahreneit: " + fahreneit);

    }
}
