import java.util.Scanner;

// Payment interface
interface Payment {
    void makePayment(double amount);
}

// UPI payment implementation
class UPI implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made via UPI.");
    }
}

// Credit Card payment implementation
class CreditCard implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made via Credit Card.");
    }
}

// Net Banking payment implementation
class NetBanking implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made via Net Banking.");
    }
}

// Driver class
public class ECommercePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for payment method
        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");
        int choice = sc.nextInt();

        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();

        Payment paymentMethod; // Polymorphic reference

        switch (choice) {
            case 1:
                paymentMethod = new UPI();
                break;
            case 2:
                paymentMethod = new CreditCard();
                break;
            case 3:
                paymentMethod = new NetBanking();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        // Process payment using polymorphism
        paymentMethod.makePayment(amount);

        sc.close();
    }
}
