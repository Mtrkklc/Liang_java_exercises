package Liang.Chapter6;

public class ConversionFeetAndMeters_69 {
    public static void main(String[] args) {
        System.out.printf("%-10s\t\t%-10s\t\t|\t\t%-10s\t\t%-10s%n","Celcius","Fahreneit","Fahreneit"
                , "Celcius");
        System.out.println("----------------------------------------------------------------------");
        for (double i = 1, j = 20; i <= 10 ; i++ ,j+= 5) {
            System.out.printf("%-10.3f\t\t%-10.3f\t\t|\t\t%-10.3f\t\t%-10.3f%n",i,footToMeter(i),j,meterToFoot(j));

        }

    }
    public static double footToMeter(double foot){
        return foot*(0.305);
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
