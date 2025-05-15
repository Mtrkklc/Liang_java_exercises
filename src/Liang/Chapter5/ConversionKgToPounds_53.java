package Liang.Chapter5;

public class ConversionKgToPounds_53 {
    public static void main(String[] args) {
        int kg = 1;
        System.out.println("Kilograms       Pounds");
        for (int i = 1; i < 200 ; i+=2) {
            System.out.printf((kg*i) + "               %.1f \n", (i*2.2));

        }
    }
}
