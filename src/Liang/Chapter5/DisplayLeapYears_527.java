package Liang.Chapter5;

public class DisplayLeapYears_527 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 101; i <2100 ; i++) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                counter++;
                System.out.print(i + " ");
                if(counter % 10 == 0)
                    System.out.println();
            }
        }
    }
}
