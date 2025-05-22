package Liang.Chapter6;

public class ConversionFahreneitCelcius_68 {
    public static void main(String[] args) {
        System.out.printf("%-10s\t\t%-10s\t\t|\t\t%-10s\t\t%-10s%n","Celcius","Fahreneit","Fahreneit"
        , "Celcius");
        System.out.println("----------------------------------------------------------------------");

        double celcius = 40;
        double fahreneit = 120;

        for (double i = 40, j = 120; i > 30 ; i-- ,j-= 10) {
            System.out.printf("%-10.1f\t\t%-10.1f\t\t|\t\t%-10.1f\t\t%-10.1f%n",i,celciusToFahreneit(i),j,fahreneitToCelcius(j));


        }

    }

    public static double celciusToFahreneit(double celcius){
        double fahreneit = (9.0/5)* celcius + 32;
        return fahreneit;
    }

    public static double fahreneitToCelcius(double fahreneit){
        double celcius = (5.0/9)* (fahreneit - 32);
        return celcius;
    }

}
