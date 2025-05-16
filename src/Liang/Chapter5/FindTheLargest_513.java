package Liang.Chapter5;

public class FindTheLargest_513 {
    public static void main(String[] args) {
        boolean isOn = true;
        int n = 0;

        while(isOn){
            n++;
            if(Math.pow(n,3) < 12000){
                System.out.println(" Sayı: " + n + " Sonuc: " + (int)(Math.pow(n,3)));
            }else {
                isOn = false;
            }
        }
    }
}
