package Liang.Chapter5;

public class DisplayPrimeNumbers_520 {
    public static void main(String[] args) {
        int counter = 0;


        for (int i = 2; i < 1000; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= (i/2); j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                counter++;
                System.out.print(i + " ");
                    if (counter % 8 == 0) {
                        System.out.println();
                    }
            }



        }


    }
}
