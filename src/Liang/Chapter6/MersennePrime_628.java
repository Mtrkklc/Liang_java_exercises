package Liang.Chapter6;

public class MersennePrime_628 {
    public static void main(String[] args) {
        System.out.printf("%-10s\t\t%-10s%n","p","2^p-1");
        System.out.println("-------------------------------");
        for (int i = 2; i <=31 ; i++) {
            if(isPrime(i) && isPrime(mersenneNumber(i))){
                System.out.printf("%-10d%-10d%n",i,mersenneNumber(i));
            }

        }

    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int mersenneNumber(int p){
        return (int)(Math.pow(2,p)-1);
    }
}
