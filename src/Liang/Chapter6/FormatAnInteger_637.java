package Liang.Chapter6;

public class FormatAnInteger_637 {
    public static void main(String[] args) {
        String formatted = format(34, 1);
        System.out.print(formatted);

    }
    public static String format(int number, int width){
        String numberStr = Integer.toString(number);
        String prefix = "0";
        int length = numberStr.length();

        if(length <=1 ){
            return numberStr;
        }

        for (int i = 0; i < (width - length) ; i++) {
            numberStr = prefix + numberStr;
        }
        return  numberStr;
    }
}
