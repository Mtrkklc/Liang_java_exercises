package Liang.Chapter6;

public class GameCraps_630 {
    public static void main(String[] args) {
        boolean isOn= true;
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = rollSum(dice1, dice2);

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.printf("You rolled %-3d+%-3d = %-3d%8s", dice1, dice2, sum, " It is craps. You Lose.");
        } else if (sum == 7 || sum == 11) {
            System.out.printf("You rolled %-3d+%-3d = %-3d%8s", dice1, dice2, sum, " It is natural. You Win");
        } else {
            int point = sum;
            System.out.printf("You rolled %-3d +%-3d = %-3d%n", dice1, dice2, sum);
            System.out.println("The point is " + sum);

            while (isOn) {
                dice1 = rollDice();
                dice2 = rollDice();
                int newSum = rollSum(dice1, dice2);
                if (point == newSum) {
                    System.out.printf("You rolled %3d+%3d = %-3d%8s", dice1, dice2, newSum, " You win");
                } else if(newSum == 7){
                    System.out.printf("You rolled %3d+%3d = %3d%8s", dice1, dice2, newSum, " You lose");
                    isOn = false;
                }
            }

        }

    }

    public static int rollDice() {
        return (int) ((Math.random() * 6) + 1);
    }

    public static int rollSum(int dice1, int dice2) {
        return dice1 + dice2;
    }
}
