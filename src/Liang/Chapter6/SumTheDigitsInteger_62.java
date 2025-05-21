package Liang.Chapter6;

public class SumTheDigitsInteger_62 {
    public static void main(String[] args) {
        long totalSum = sumDigits(789);
        System.out.println("Total Sum: " + totalSum);

    }
    public static int sumDigits(long n){
        String word = Long.toString(n);
        long division;
        long sum = 0;

        for (int i = 0; i < word.length() ; i++) {
            division = n%10;
            n/=10;
            sum += division;
        }

        return (int)sum;
    }
}
