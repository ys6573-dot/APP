import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // Constructor
    Product(int id, String name, double price, int qty) {
        this.productId = id;
        this.productName = name;
        this.price = price;
        this.quantity = qty;
    }

    // Method to calculate and display billing details
    void calculateBill() {
        double totalPrice = price * quantity;
        double discount;

        // Conditional discount
        if (totalPrice >= 5000) {
            discount = totalPrice * 0.10; // 10% discount
        } else {
            discount = totalPrice * 0.05; // 5% discount
        }

        double finalPrice = totalPrice - discount;

        // Display details
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
        System.out.println("-----------------------------------");
    }
}

public class ProductBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 5 Product objects
        Product[] products = new Product[5];

        // Input product details
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            products[i] = new Product(id, name, price, qty);
        }

        System.out.println("\n--- Billing Details ---");
        // Display billing for each product
        for (Product p : products) {
            p.calculateBill();
        }

        sc.close();
    }
}
