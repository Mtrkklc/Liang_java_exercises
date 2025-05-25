package Liang.Chapter6;

public class ChanceOfWinningGames_632 {
    public static void main(String[] args) {
        int wincount = 0;
        for (int i = 0; i < 10000; i++) {
            if(playCraps()){
                wincount++;
            }
        }
        System.out.println(wincount);
    }

    public static boolean playCraps() {

        int dice1 = rollDie();
        int dice2 = rollDie();
        int sum = rollSum(dice1, dice2);

        if (sum == 2 || sum == 3 || sum == 12) {
            return false;
        } else if (sum == 7 || sum == 11) {
            return true;
        } else {
            int point = sum;

            while (true){
                dice1 = rollDie();
                dice2 = rollDie();

                int newSum = rollSum(dice1, dice2);
                if (point == newSum) {
                    return true;
                } else if(newSum == 7) {
                    return false;
                }

            }

        }
    }

    public static int rollSum(int dice1, int dice2) {
        return dice1 + dice2;
    }
    public static int rollDie(){
        return (int) ((Math.random() * 6) + 1);
    }
}
