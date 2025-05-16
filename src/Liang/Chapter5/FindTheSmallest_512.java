package Liang.Chapter5;

public class FindTheSmallest_512 {
    public static void main(String[] args) {
        boolean isOn = true;
        int n = 0;

        while(isOn){
            n++;
            if(Math.pow(n,2) > 12000){

                System.out.print("Sayi: " + n + "\nSonuç: " + (Math.pow(n,2)));
                isOn = false;
            }
        }
    }
}
