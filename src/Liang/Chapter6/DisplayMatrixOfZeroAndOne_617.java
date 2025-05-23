package Liang.Chapter6;

public class DisplayMatrixOfZeroAndOne_617 {
    public static void main(String[] args) {
        printMatrix(5);
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(createRandomNumber() + " ");
            }
            System.out.println();

        }

    }
    public static int createRandomNumber(){
        return (int) (Math.random()*2);
    }
}
