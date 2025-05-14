package Liang.Chapter2;

import java.util.Scanner;

public class geometryAreaOfTriangle_219 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x1 ve y1 gir: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("x2 ve y2 gir: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("x3 ve y3 gir: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double dist1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        double dist2 = Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
        double dist3 = Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));

        double s = (dist1 + dist2 + dist3)/2.0;
        double area = Math.sqrt(Math.abs(s*(s-dist1)*(s-dist2)*(s-dist3)));

        System.out.printf("Üçgenin alanı: %.2f", area);
    }
}
