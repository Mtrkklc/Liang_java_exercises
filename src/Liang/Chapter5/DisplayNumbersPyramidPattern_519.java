package Liang.Chapter5;

public class DisplayNumbersPyramidPattern_519 {
    public static void main(String[] args) {
        int rows = 8;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows-i-1 ; j++) {
                System.out.print("    ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d",((int)Math.pow(2,k)));
            }
            for (int s = i - 1; s >= 0; s--) {
                System.out.printf("%4d", (int)Math.pow(2, s));
            }

            System.out.println();
        }
    }
}
