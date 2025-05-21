package Liang.Chapter6;

public class SortThreeNumbers_65 {
    public static void main(String[] args) {
    displaySortedNumbers(13,99,1);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.printf("%2.2f<%2.2f<%2.2f", num1, num2, num3);

    }
}
