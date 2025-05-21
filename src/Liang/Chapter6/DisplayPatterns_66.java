package Liang.Chapter6;

public class DisplayPatterns_66 {
    public static void main(String[] args) {
        displayPattern(25);
    }
    public static void displayPattern(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print("   ");
            }
            for (int k = i+1; k >0 ; k--) {
                System.out.printf("%3d", k);
            }
            System.out.println();
        }
    }
}
