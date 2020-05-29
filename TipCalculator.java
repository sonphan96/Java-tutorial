import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Ask for Restaurant name
        System.out.println("Enter the restaurant name: ");
        String restaurantName = scan.next();
        // The bill amount
        System.out.println("Enter the bill amount: ");
        double amount = scan.nextDouble();
        // The percentage of tip
        System.out.println("Enter the tip percentage: ");
        int tipAmount = scan.nextInt();
        // Amount + amount*tipAmount/100
        double totalPay = amount + amount*tipAmount/100;

        // display result to user
        System.out.println("Total amount to pay: $" + totalPay);

    }
}
