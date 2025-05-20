package Liang.Chapter5;

public class SimulationHeadOrTails_540 {
    public static void main(String[] args) {

        for (int i = 0; i < 1000000; i++) {
            int flipTheCoin = (int) (Math.random()*2);
            if (flipTheCoin == 1){
                System.out.println("Head");
            }else{
                System.out.println("Coin");
            }
        }

    }
}
