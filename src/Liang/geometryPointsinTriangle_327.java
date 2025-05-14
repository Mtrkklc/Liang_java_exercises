package Liang;

import java.util.Scanner;

public class geometryPointsinTriangle_327 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double oX = 0.0;
        double oY = 0.0;
        double p1X = 0.0;
        double p1Y = 100.0;
        double p2X = 200.0;
        double p2Y = 0.0;

        System.out.print("Lütfen X koordinatını giriniz: ");
        double userX = input.nextDouble();
        System.out.print("Lütfen Y koordinatını giriniz: ");
        double userY = input.nextDouble();

        if (userX >= oX && userY >= oY && userX <= p2X  && userY <= p1Y){
            System.out.print("Girdiğiniz noktalar üçgenin içindedir." + "X: " + userX + " Y: " + userY);
        }
    }
}
