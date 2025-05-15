package Liang.Chapter5;

public class ConversionMileToKm_54 {
    public static void main(String[] args) {
        int miles = 1;
        System.out.print("Miles             Kilometres \n");
        for (int i = 1; i <11 ; i++) {
            System.out.printf(miles*i + "                %.3f ",(i *1.609));
            System.out.println();
        }
    }
}
