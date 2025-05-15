package Liang.Chapter5;

public class ConversionKgToPoundsVV_55 {
    public static void main(String[] args) {
        System.out.println("Kilograms\tPounds\t\t|\tPounds\tKilograms");
        for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
            System.out.printf("%-10d\t%-10.1f\t|\t%-6d\t%-10.2f%n",i,(i*2.2),(j),(j/2.2));
        }
    }
}
