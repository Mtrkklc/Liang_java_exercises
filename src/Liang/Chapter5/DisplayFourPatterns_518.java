package Liang.Chapter5;

public class DisplayFourPatterns_518 {
    public static void main(String[] args) {
        System.out.print("----------Pattern A------------\n");
        // Pattern A:

        for (int i = 0; i < 6 ; i++) {
            for (int j = 1; j <= (i+1); j++) {
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
        System.out.print("----------Pattern B------------\n");
        // Pattern B:

        for (int i = 0; i < 6 ; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
        System.out.print("----------Pattern C------------\n");
        // Pattern C:
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 6-i ; j++) {
                System.out.print(" ");

            }

            for (int k = (i+1); k >= 1 ; k--) {
                System.out.print(" "+ k);
            }
            System.out.println();
        }
        // Pattern D:
        System.out.print("----------Pattern D------------\n");
        for (int i = 0; i < 6; i++) {
            for (int k = 1; k <= i+1 ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j < 7-i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }
    }
}
