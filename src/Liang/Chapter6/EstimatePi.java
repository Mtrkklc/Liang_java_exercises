package Liang.Chapter6;

public class EstimatePi {
    public static void main(String[] args) {
        System.out.printf("%-4s\t%10s%n", "i", "m(i)");
        System.out.println("-------------------");
        EstimatePiValue(1000);

    }

    public static void EstimatePiValue(int number) {
        double result = 0;
        int currentIndex = 1;

        for (int i = 1; i <= number; i++) {
            double term = (Math.pow(-1, (i + 1)) / ((2 * i) - 1));
            result += (term);

            if(i == currentIndex){
                System.out.printf("%-4d\t%10.4f%n", i, 4*result);
                currentIndex += 100;
            }
        }
    }
}
