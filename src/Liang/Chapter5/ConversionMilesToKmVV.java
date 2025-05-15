package Liang.Chapter5;

public class ConversionMilesToKmVV {
    public static void main(String[] args) {
            System.out.println("Miles\tKilometers\t\t|\tKilometers\tMiles");
            for (int i = 1, j = 20; i < 11; i += 1, j += 5) {
                System.out.printf("%-10d%-10.3f\t|\t%-10d%10.3f%n", i, (i * 1.609), (j), (j / 1.609));

            }
    }
}
