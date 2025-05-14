package Liang;

public class IsPrimeMySelf {
    public static void main(String[] args) {
        final int NUMBER = 100;
        int count = 0;

        for (int number = 2; number <=NUMBER ; number++) {
            if(IsPrime(number)){
                count++;
                System.out.print("Sayı: " + number + "\n");
            }
        }
        System.out.print("Asal sayı sayısı: " + count);

    }

    public static boolean IsPrime(int num){
        if (num <= 1) return false;
        for (int i = 2; i <= num/2 ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
