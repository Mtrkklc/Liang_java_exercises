package Liang.Chapter6;

public class ConvertMillisToHMS_625 {
    public static void main(String[] args) {
        System.out.println(convertMillis(100000));
    }


    public static String convertMillis(long millis) {
        long second = millis / 1000;
        long minutes = second / 60;
        long hours = minutes / 60;

        return String.format("%5d:%2d:%2d", (hours), (minutes % 60), (second % 60));

    }

}