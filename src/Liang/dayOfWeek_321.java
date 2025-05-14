package Liang;

import java.util.Scanner;

public class dayOfWeek_321 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yıl değeri giriniz (e.g 2012): ");
        int year  = input.nextInt();
        System.out.print("Lütfen ay değeri giriniz (1-12): ");
        int month  = input.nextInt();
        System.out.print("Lütfen gün değeri giriniz (1-31): ");
        int dayOftheMonth  = input.nextInt();

        if (month == 1){
            month = 13;
            year --;
        }else if (month == 2){
            month = 14;
            year--;
        }

        int dayOfTheWeek = (dayOftheMonth + ((26*(month+1))) /10 + (year % 100)  + ((year % 100)/4) + ((year/100)/4) + (5* (year/100))) % 7;

        switch (dayOfTheWeek){
            case 0: System.out.print("Day of the week is Saturday");break;
            case 1: System.out.print("Day of the week is Sunday");break;
            case 2: System.out.print("Day of the week is Monday");break;
            case 3: System.out.print("Day of the week is Tuesday");break;
            case 4: System.out.print("Day of the week is Wednesday");break;
            case 5: System.out.print("Day of the week is Thursday");break;
            case 6: System.out.print("Day of the week is Friday");break;
        }

    }
}
