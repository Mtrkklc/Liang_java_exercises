package Liang.Chapter5;

import java.util.Scanner;

public class FindTwoHighestScore_59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String winnerName = "";
        int winnerScore = 0;
        String secondWinnerName = "";
        int secondWinnerScore = 0;


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student: ");
            String userName = input.next();
            System.out.print("Enter the score of student: ");
            int userScore = input.nextInt();

            if (winnerScore < userScore){
                secondWinnerScore = winnerScore;
                secondWinnerName = winnerName;

                winnerScore = userScore;
                winnerName = userName;
            }else if (secondWinnerScore <userScore && userScore < winnerScore){
                secondWinnerScore = userScore;
                secondWinnerName = userName;
            }
        }
        System.out.println("Winner name: " + winnerName);
        System.out.println("Winner score: " + winnerScore);

        System.out.println("Second Winner name: " + secondWinnerName);
        System.out.println("Second Winner score: " + secondWinnerScore);
    }
}
