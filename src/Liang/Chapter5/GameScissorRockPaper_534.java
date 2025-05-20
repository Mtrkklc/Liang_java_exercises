package Liang.Chapter5;

import java.util.Scanner;

public class GameScissorRockPaper_534 {
    public static void main(String[] args) {
        /*
        scissor:0
        rock:1;
        paper:2
        */
        Scanner input = new Scanner(System.in);
        boolean  isOn = true;


        while(isOn){
            int computer = (int) (Math.random()*3);
            System.out.println("\nPlease enter a number that Scissor(0), Rock(1), Paper(2), ends with (5): ");
            int myNumber = input.nextInt();

            if(myNumber == 5) {
                System.out.print("Game Over. ");
                isOn = false;
            }
            switch (computer){
                case 0: switch (myNumber) {
                    case 0:
                        System.out.print("The computer is Scissor. You are Scissor. It's a draw");
                        break;

                    case 1:
                        System.out.print("The computer is Scissor. You are Rock. You won");
                        break;
                    case 2:
                        System.out.print("The computer is Scissor. You are Paper. You lost");
                        break;
                } break;
                case 1: switch (myNumber){
                    case 0:
                        System.out.print("The computer is Rock. You are Scissor. You lost");
                        break;
                    case 1:
                        System.out.print("The computer is Rock. You are Rock. It's a draw");
                        break;
                    case 2:
                        System.out.print("The computer is Rock. You are Paper. You won");
                        break;

                }break;
                case 2: switch (myNumber){
                    case 0:
                        System.out.print("The computer is Paper. You are Scissor. You won");
                        break;
                    case 1:
                        System.out.print("The computer is Paper. You are Rock. You lost");
                        break;
                    case 2:
                        System.out.print("The computer is Paper. You are Paper. It's a draw");
                        break;

                }break;
            }
        }

    }
}
