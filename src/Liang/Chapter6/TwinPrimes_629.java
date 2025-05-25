package Liang.Chapter6;

public class TwinPrimes_629 {
    public static void main(String[] args) {
        for (int i = 2; i <1000 ; i++) {
            if(isPrime(i) && isPrime(i+2)){
                System.out.printf("(%-2d,%-2d)%n",i,(i+2));
            }
        }
    }
    public static boolean isPrime(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
