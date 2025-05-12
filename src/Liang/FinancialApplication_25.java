package Liang;
import java.util.Scanner;

public class FinancialApplication_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please insert subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Please insert gratuity rate as percent(%): ");
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal*(gratuityRate*(0.01));
        double total = subtotal + gratuity;

        System.out.print("The gratuity is " + " $" + gratuity + " and total is " + " $" + total );


    }
}
