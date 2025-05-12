package Liang;

import java.util.Scanner;

public class findTheFutureDays_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int futureDay = input.nextInt();

        switch ((today + futureDay) % 7){
            case 0: System.out.print("Sunday");break;
            case 1: System.out.print("Monday");break;
            case 2: System.out.print("Tuesday");break;
            case 3: System.out.print("Wednesday");break;
            case 4: System.out.print("Thursday");break;
            case 5: System.out.print("Friday");break;
            case 6: System.out.print("Saturday");break;
        }


    }

}
