package Liang.Chapter5;

public class FindTheNumberDivisibleFSNotBoth_511 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 100; i <1000 ; i++) {
            if ((i % 5 == 0 || i % 6 == 0) && i % 30 != 0) {
                System.out.print(i + "  ");
                counter++;
            }
            if (counter % 10 == 0) {
                System.out.println();
            }

        }
    }
}
