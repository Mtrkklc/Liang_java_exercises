package Liang;

import java.util.Scanner;

public class PhysicsAcceleration_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen başlangıç hızını giriniz: ");
        double velocityZero = input.nextDouble();

        System.out.print("Lütfen bitiş hızını giriniz: ");
        double velocityEnd = input.nextDouble();

        System.out.print("Lütfen geçen süreyi giriniz: ");
        double deltaTime = input.nextDouble();

        double acceleration = (velocityEnd-velocityZero) / deltaTime ;

        System.out.print("İvme: " + acceleration);
        System.exit(0);

    }

}
