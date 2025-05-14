package Liang;

public class IsPrime {
    public static void main(String[] args) {
        int count = 0;
        int n = 100;

        for (int number = 2; number <= n ; number++) {
            if(IsPrime(number)){
            count++;
            }

        }
        System.out.println("1 ile " + n + " arasındaki asal sayı adedi: " + count);
    }
    public static boolean IsPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2 ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
