package Liang.Chapter5;

public class MathCombinations_543 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 1; i <= 7 ; i++) {
            for (int j = i+1; j <= 7 ; j++) {
                System.out.printf("%-2d%-2d%n",i,j);
                counter++;
            }
        }
        System.out.print("Total number of all combinations: " + counter);
    }
}
