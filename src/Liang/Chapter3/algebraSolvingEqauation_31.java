package Liang.Chapter3;

import java.util.Scanner;


public class algebraSolvingEqauation_31 {
    public static void main(String[] args) {
        // equation : ax^2 + bx + c
        double kök1,kök2,kök;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sırasıyla a,b ve c değerlerini giriniz: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant =  Math.pow(((b*b)-(4*a*c)),0.5);
        kök1 = (-b + discriminant) / 2*a;
        kök2 = (-b - discriminant) / 2*a;

        if (discriminant>0){
            System.out.print("Denklemin 2 kökü vardır. r1: " + kök1 + "r2: " + kök2);
        }else if (discriminant == 0){
            System.out.print("Denklemin 1 kökü vardır. r: " + kök1);
        }else {
            System.out.print("Denklemin gerçek kökü bulunmamaktadır.");
        }





    }
}

