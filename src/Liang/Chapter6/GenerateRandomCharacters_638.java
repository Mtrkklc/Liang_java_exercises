package Liang.Chapter6;

public class GenerateRandomCharacters_638 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(randomCharacter());
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(randomNumber());
        }

    }

    private static char randomNumber() {
        return (char) getRandomNumber();
    }

    public static char randomCharacter() {
        return (char) getRandomUppercase();

    }

    public static int getRandomUppercase() {
        return (int) ((Math.random() * 26) + 65);
    }

    public static int getRandomNumber() {
        return (int) ((Math.random() * 10 ) + 48);
    }


}
