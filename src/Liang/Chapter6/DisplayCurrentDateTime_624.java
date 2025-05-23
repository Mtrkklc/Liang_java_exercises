package Liang.Chapter6;

import javax.crypto.spec.PSource;

public class DisplayCurrentDateTime_624 {
    public static void main(String[] args) {
        String dateTime = convertMillis();
        System.out.println("Current Time: " + convertMillis());
    }

    public static String convertMillis() {

        long year = 1970;
        long millis = System.currentTimeMillis();
        long second = millis / 1000;
        long minutes = second / 60;
        long hours = minutes / 60;

        long days = hours / 24;

        while (true) {
            boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
            int daysInyear = isLeapYear ? 366:365;
            if(days >= daysInyear){
                days -= daysInyear;
                year++;
            }else{
                break;
            }
        }
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            daysInMonths[1] = 29; // Şubat için artık yıl düzeltmesi
        }

        int month = 0;

        while (days >= daysInMonths[month]) {
            days -= daysInMonths[month];
            month++;
        }

        int day = (int) days + 1;

        return String.format("Tarih: %02d/%02d/%d - Saat: %02d:%02d:%02d%n",
                day, month + 1, year, (hours%24), (minutes%60), (second%60));
    }
}
