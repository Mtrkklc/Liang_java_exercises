package Liang.Chapter4;

import java.util.Scanner;

public class daysOfMonth_417 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir yıl değeri giriniz: ");
        int year = input.nextInt();
        System.out.print("Lütfen istediğiniz ay ismini 3 harf olacak şekilde giriniz: (örn. Jan,Feb) ");
        String month = input.next().toUpperCase();

        switch (month)
        {
            case "JAN":
            case "MAR":
            case "MAY":
            case "JUL":
            case "AUG":
            case "OCT":
            case "DEC": System.out.printf(month + " " + year + " has 31 days.");break;
            case "APR":
            case "JUN":
            case "SEPT":
            case "NOV":System.out.printf(month + " " + year + " has 30 days.");break;
            case "FEB":
                if (year % 4 == 0  && year % 100 != 0 || year % 400 == 0){
                    System.out.printf(month + " " + year + " has 29 days.");
                }else{
                    System.out.printf(month + " " + year + " has 28 days.");
                }break;
        }



    }
}
