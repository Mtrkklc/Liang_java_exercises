package Liang.Chapter4;

import java.util.Scanner;

public class geometryGreatCircleDistance_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci noktanın enlemini (latitude) giriniz: ");
        double lat1 = Math.toRadians(input.nextDouble());

        System.out.print("Birinci noktanın boylamını (longitude) giriniz: ");
        double lon1 = Math.toRadians(input.nextDouble());

        System.out.print("İkinci noktanın enlemini (latitude) giriniz: ");
        double lat2 = Math.toRadians(input.nextDouble());

        System.out.print("İkinci noktanın boylamını (longitude) giriniz: ");
        double lon2 = Math.toRadians(input.nextDouble());

        double radius = 6371.01;   // Dünya'nın yarıçapı (km)

        double distance = radius * Math.acos(
                Math.sin(lat1) * Math.sin(lat2) +
                        Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)
        );

        System.out.printf("İki nokta arasındaki mesafe: %.2f km\n", distance);
    }
}

