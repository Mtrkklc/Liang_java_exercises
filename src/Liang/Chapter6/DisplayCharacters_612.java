package Liang.Chapter6;

public class DisplayCharacters_612 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerline){
        numberPerline = 0;
        for (int i = (int)ch1; i <= (int)ch2 ; i++) {
            System.out.print((char)i);
            numberPerline++;
            if(numberPerline %10 == 0){
                System.out.println();
            }
        }
    }
}
