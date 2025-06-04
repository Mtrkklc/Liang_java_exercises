package Liang.Chapter7;

import java.util.Scanner;

public class SortStudents_717 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of Students: ");
        int numberOfStudents = input.nextInt();

        double[] listsOfScores = new double[numberOfStudents];
        String[] nameOfStudents = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of students: ");
            nameOfStudents[i] = input.nextLine();

            System.out.print("Enter the student's score: ");
            listsOfScores[i] = input.nextDouble();
        }


    }

    public static double[] sortedScoreList(double[] list){
        int minIndex;
        for (int i = 0; i < list.length-1; i++) {

            minIndex = i;
            for (int j = i+1; j < list.length ; j++) {
                if(list[j] < list[minIndex]){
                    minIndex = j;
                }
            }

            double temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }

        return list;
    }
    public static double[] sortedNameList(double[] list){

    }

}
