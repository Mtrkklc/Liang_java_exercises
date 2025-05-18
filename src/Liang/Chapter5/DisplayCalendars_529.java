package Liang.Chapter5;

import java.util.Scanner;


public class DisplayCalendars_529 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yıl ve Ocak 1’in haftalık günü alınır
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0=Sun, 1=Mon, ..., 6=Sat): ");
        int startDay = input.nextInt();

        // Ay adları
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Her ayın gün sayısı
        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        // Artık yıl kontrolü
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        // Her ay için döngü
        for (int i = 0; i < 12; i++) {
            System.out.printf("\n\t%s %d\n", months[i], year);
            System.out.println("-----------------------------");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Ay başında kaç boşluk?
            for (int space = 0; space < startDay; space++) {
                System.out.print("    ");
            }

            // Günleri yazdır
            for (int day = 1; day <= daysInMonth[i]; day++) {
                System.out.printf("%-4d", day);

                // Satır sonuna geldik mi?
                if ((day + startDay) % 7 == 0) {
                    System.out.println();
                }
            }

            // Bir sonraki ayın ilk günü için startDay’i güncelle
            startDay = (startDay + daysInMonth[i]) % 7;
            System.out.println(); // Aylar arası boşluk
        }
    }
}
