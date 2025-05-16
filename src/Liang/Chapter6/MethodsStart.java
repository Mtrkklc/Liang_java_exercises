package Liang.Chapter6;

public class MethodsStart {
    public static void main(String[] args) {
        System.out.print("Sonuc: " + sum(0,10));
    }
    public static int sum (int i1, int i2){
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            sum += i;

        }
        return sum;
    }
}
