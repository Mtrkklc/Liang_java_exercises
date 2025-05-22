package Liang.Chapter6;

public class SumSeries_613{
    public static void main(String[] args) {
        System.out.printf("%-4s\t%10s%n","i" , "m(i)");
        System.out.println("-------------------");
        SumSeries(20);
    }

    public static void SumSeries(int number){
        double result  = 0;

        for (int i = 1; i <= number ; i++) {
            result += ((double) i / (i+1));
            System.out.printf("%-4d\t%10.4f%n",i , result);
        }
    }
}
