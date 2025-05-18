package Liang.Chapter5;

import java.util.Scanner;

public class DisplayTheFirstDayMonth_528 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        System.out.println("Enter the day: ");
        int startDay = input.nextInt();

        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };
        
        if(year%4 == 0 && year %100 !=0 ||year % 400 == 0){
            daysInMonth[1] = 29;
        }
        for (int i = 0; i <12 ; i++) {
            System.out.println(monthNames[i] + " 1, " + year + " is " + getDayName(startDay));
            startDay = (startDay + daysInMonth[i]) % 7; // bir sonraki ayın ilk günü
        }
            
    }

    public static String getDayName(int day) {
        switch (day) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Invalid";
        }
    }




}


