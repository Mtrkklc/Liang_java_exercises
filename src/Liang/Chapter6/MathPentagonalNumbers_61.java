package Liang.Chapter6;

public class MathPentagonalNumbers_61 {
    public static void main(String[] args) {
        int counter = 0;
        boolean isOn = true;
        int pentagonalNumber;

        while (isOn){
            counter++;
            pentagonalNumber = getPentagonalNumber(counter);
            System.out.printf("%-7d", pentagonalNumber);

            if(counter % 10 == 0){
                System.out.println();
            }
            if(counter == 100){
                isOn = false;
            }

        }
    }
    public static int getPentagonalNumber(int n){
        int pentagonalNumber = (n*((3*n)-1)/2);
        return pentagonalNumber;
    }
}
