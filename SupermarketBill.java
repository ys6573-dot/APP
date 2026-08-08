import java.util.Scanner;

public class SupermarketBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create an array to store prices of 5 products
        int[] prices = new int[5];
        int totalBill = 0;

        // Step 2: Read prices using for loop
        System.out.println("Enter prices of 5 products:");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
            totalBill += prices[i];  // Add each price to total
        }

        // Step 3: Display total bill
        System.out.println("Total Bill : " + totalBill);

        // Step 4: Check discount condition using if statement
        if (totalBill > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}
