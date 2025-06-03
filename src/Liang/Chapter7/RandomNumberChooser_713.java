package Liang.Chapter7;

public class RandomNumberChooser_713 {
    public static void main(String[] args) {
        int[] excludedNumbers = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int random = getRandomNumber(excludedNumbers);
        System.out.println("Selected number: " + random);
    }

    public static int getRandomNumber(int[] excluded) {
        while (true) {
            int rand = (int) (Math.random() * 54) + 1;

            boolean isExcluded = false;
            for (int i = 0; i < excluded.length; i++) {
                if (excluded[i] == rand) {
                    isExcluded = true;
                    break;
                }
            }

            if (!isExcluded) {
                return rand;
            }
        }
    }
}
