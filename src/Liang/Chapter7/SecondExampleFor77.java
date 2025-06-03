package Liang.Chapter7;

public class SecondExampleFor77 {
    public static void main(String[] args) {
        int[] countsOfScores = new int[11];
        int max= 0;

        for (int i = 0; i < 30; i++) {
            int number = (int) (Math.random() * 11) * 10;
            countsOfScores[number / 10]++;
        }

        for (int i = 0; i < countsOfScores.length; i++) {
            max = countsOfScores[0];

            if (max < countsOfScores[i]) {
                max = countsOfScores[i];
            }
        }
        System.out.printf("En çok tekrar eden sayı: " , max);


    }
}
