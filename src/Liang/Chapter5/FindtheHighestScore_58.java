package Liang.Chapter5;

import java.util.Scanner;

public class FindtheHighestScore_58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String winnerName = "";
        int winnerScore = 0;


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student: ");
            String userName = input.next();
            System.out.print("Enter the score of student: ");
            int userScore = input.nextInt();

            if (winnerScore < userScore){
                winnerScore = userScore;
                winnerName = userName;
            }
        }
        System.out.print("Thw winner is: " + winnerName + " with score of " + winnerScore);

    }
}
