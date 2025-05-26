package Liang.Chapter7;

import java.util.Scanner;

public class AssignGrades_71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int numberOfStudents = input.nextInt();
        int best = 0;

        int[] scores = new int[numberOfStudents];

        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
            best = findBest(scores);
        }
        System.out.println(best);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + i + " score is: " + scores[i] + " and grade is: " + assignGrades(best, scores[i]));
        }


    }

    public static char assignGrades(int max, int score) {

        if (max - 10 <= score) {
            return 'A';
        } else if (max - 20 <= score) {
            return 'B';
        } else if (max - 30 <= score) {
            return 'C';
        } else if (max - 40 <= score) {
            return 'D';
        } else {
            return 'F';
        }

    }

    public static int findBest(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

}
