package Liang.Chapter7;

public class ComputingGcd_714 {
    public static void main(String[] args) {
        int[] numbers = new int[] {96, 144, 480, 48, 72};
        int result = gcd(numbers);
        System.out.println("The GCD is: " + result);

    }

    public static int gcd (int ... numbers){
        int result = numbers[0];

        for (int i = 1; i < numbers.length ; i++) {
            result = getTwoGcd(result,numbers[i]);
        }
        return result;
    }

    public static int getTwoGcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
