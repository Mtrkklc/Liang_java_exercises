package Liang.Chapter6;

public class DisplayAnIntegerReversed_64 {
    public static void main(String[] args) {
        reverse(6548);

    }
    public static void reverse(int number){
        int reverse = 0;

        while(number != 0){
            int digit = number % 10;
            reverse = (reverse *10) + digit;
            number/=10;
        }
        System.out.print("Reversed Number: " + reverse);
    }
}
