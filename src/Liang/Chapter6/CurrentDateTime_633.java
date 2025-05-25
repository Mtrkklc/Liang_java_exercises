package Liang.Chapter6;

public class CurrentDateTime_633 {
    public static void main(String[] args) {
        long totalDays = getHours() / 24;
        int year = 1970;

        // Yılı bul
        while (totalDays >= daysInYear(year)) {
            totalDays -= daysInYear(year);
            year++;
        }

        // Ayı bul
        int[] daysInMonth = {
                31,
                isLeapYear(year) ? 29 : 28,
                31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        int month = 0;
        while (totalDays >= daysInMonth[month]) {
            totalDays -= daysInMonth[month];
            month++;
        }

        int day = (int) totalDays + 1;  // Geriye kalan gün

        // Zaman
        long hour = getCurrentHours();
        long minute = getCurrentMinutes();
        long second = getCurrentSeconds();

        System.out.printf("Current date and time is %d-%02d-%02d %02d:%02d:%02d%n",
                year, month + 1, day, hour+3, minute, second);
    }

    public static long getSeconds() {
        return System.currentTimeMillis() / 1000;
    }

    public static long getMinutes() {
        return getSeconds() / 60;
    }

    public static long getHours() {
        return getMinutes() / 60;
    }

    public static long getCurrentSeconds() {
        return getSeconds() % 60;
    }

    public static long getCurrentMinutes() {
        return getMinutes() % 60;
    }

    public static long getCurrentHours() {
        return getHours() % 24;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int daysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }
}
