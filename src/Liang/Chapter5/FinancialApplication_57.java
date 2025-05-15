package Liang.Chapter5;

public class FinancialApplication_57 {
    public static void main(String[] args) {
        int tuition = 10_000;
        int increaseRate = 5;

        // 10 yıl sonraki yıllık ücret
        for (int i = 0; i < 10; i++) {
            tuition = (int) (tuition * (1 + (increaseRate * 0.01)));
        }
        System.out.println("10 yıl sonraki yıllık ücret: " + tuition + " TL");

        // İlk 4 yılın toplam maliyeti
        double totalCost = 0;
        double currentTuition = 10_000;
        for (int i = 0; i < 4; i++) {
            totalCost += currentTuition;
            currentTuition = currentTuition * (1 + (increaseRate * 0.01));
        }
        System.out.println("4 yılın toplam maliyeti: " + totalCost + " TL");
    }
}
