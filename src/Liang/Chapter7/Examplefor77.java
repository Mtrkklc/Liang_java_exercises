package Liang.Chapter7;

public class Examplefor77 {
    public static void main(String[] args) {
        int[] votes = new int[5];

        for (int i = 0; i < 10; i++) {
            int vote = (int) (Math.random() * 5);
            votes[vote]++;
        }

        for(int vote : votes){
            System.out.println(vote);
        }
    }
}
