package Liang.Chapter5;

public class DisplayFourPatterns_518 {
    public static void main(String[] args) {
        // Pattern A:

        for (int i = 0; i < 6 ; i++) {
            for (int j = 1; j <= (i+1); j++) {
                System.out.printf("%3d",j);
            }
            System.out.println();
        }

        // Pattern B:

        for (int i = 0; i < 6 ; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.printf("%3d",j);
            }
            System.out.println();
        }

        // Pattern C:

    }
}
