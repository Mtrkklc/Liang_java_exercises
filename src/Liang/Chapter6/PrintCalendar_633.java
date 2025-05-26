package Liang.Chapter6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintCalendar_633 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month [1-12]: ");
        int month = input.nextInt();

        int[] daysInMonths = new int[]{
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        if (isLeap(year)) {
            daysInMonths[1] = 29;
        }
        System.out.println();
        System.out.printf("%13s%13d%n", getMonth(month), year);
        System.out.println("-------------------------------------");
        System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s%n", "Sun", "Mon", "Tue", "Wed", "Thr", "Fri","Sat");


        for (int i = 0; i < getStartDay(year, month); i++) {
            System.out.printf("%-6s", "");
        }
        for (int i = 1; i <= daysInMonths[month - 1]; i++) {
            System.out.printf("%-6d", i);
            if ((getStartDay(year, month) + i) % 7 == 0) {
                System.out.println();
            }
        }


    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static int getStartDay(int year, int m) {
        if (m == 1 || m == 2) {
            m += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;
        int q = 1;
        int h;


        h = (q + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        return (h + 6) % 7; // gün dönecek.
    }

    public static String getDayName(int h) {
        return switch (h) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "";
        };
    }

    public static String getMonth(int m) {
        return switch (m) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };

    }


}
