package Liang.Chapter6;

public class NumberOfDaysInaYear_616 {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            int numberOfDays  = numberOfDaysInAYear(i);
            System.out.println("Number of Days in " + i + " : " + numberOfDays);
        }

    }

    public static int numberOfDaysInAYear(int year) {
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                    sum += 31;
                    break;
                case 1:
                    if (isLeapYear(year)) {
                        sum += 29;
                    } else {
                        sum += 28;
                    }
                    break;
                case 2:sum += 31;break;
                case 3: sum += 30;break;
                case 4: sum += 31;break;
                case 5: sum += 30;break;
                case 6: sum += 31;break;
                case 7: sum += 31;break;
                case 8: sum += 30;break;
                case 9: sum += 31;break;
                case 10: sum += 30;break;
                case 11: sum += 31;break;
            }

        }
        return sum;
    }
    private static boolean isLeapYear (int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
