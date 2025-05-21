package Liang.Chapter6;

public class PalindromeInteger_63 {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(14451);

        if(isPalindrome){
            System.out.print("This is a palindrome number.");
        }else {
            System.out.print("This is not a palindrome number.");
        }
    }
    public static int reverse(int number){
        String word = Integer.toString(number);
        String reverse = "";
        int division = 0;

        for (int i = 0; i < word.length(); i++) {
            division = number%10;
            number /= 10;
            reverse = reverse + division;
        }
        return Integer.parseInt(reverse);
        /*
        Alternatif yol;
        while(number!=0){
        int digit = number % 10;
        reverse = reverse *10 + digit;
        number/= 10;
         */
    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
