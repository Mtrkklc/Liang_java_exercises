package Liang.Chapter6;

public class OrnekAlistirmalar {
    public static void main(String[] args) {
        /*double unitPrice = 20;
        double totalMoney = 2000;
        int totalAmount = 0;
        double totalCost = 0;

        while(totalCost<totalMoney){
            totalAmount++;
            totalCost = totalAmount * unitPrice;
        }
        System.out.println("Alabileceğin maksimum ürün sayısı: " + (totalAmount));
        */

        double unitPrice;
        double totalMoney = 2000;
        int totalAmount = 0;
        double totalCost = 0;

        while (totalCost <= totalMoney) {
            totalAmount++;
            if (totalAmount <= 10) {
                totalCost += 20;

            } else {
                totalCost += 30;

            }

        }

        System.out.println("Alabileceğin maksimum ürün sayısı: " + (totalAmount-1));




        double commision = 0;
        double salesAmount = 0;
        double goal = 1500;

        while(commision <= goal){
            if(salesAmount <= 1000){
                commision = salesAmount * 0.05;
            } else if (salesAmount <=5000) {
                commision = 1000 * 0.05 + (salesAmount-1000)*0.07;
            }else{
                commision = 1000*0.05 + 4000* 0.07 + (salesAmount-5000)*0.10;
            }
            salesAmount +=0.01;
        }
        System.out.println("sales amount: " + salesAmount);



    }
}
