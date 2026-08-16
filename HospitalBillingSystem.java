import java.util.Scanner;

class Patient {
    String name;
    double consultationFee;

    // Parameterized constructor
    Patient(String name, double fee) {
        this.name = name;
        this.consultationFee = fee;
    }

    // Method to calculate final amount with discount
    double calculateFinalAmount() {
        double discount = (consultationFee >= 2000) ? consultationFee * 0.10 : consultationFee * 0.05;
        return consultationFee - discount;
    }

    // Method to display patient details
    void displayDetails() {
        double discount = (consultationFee >= 2000) ? consultationFee * 0.10 : consultationFee * 0.05;
        double finalAmount = consultationFee - discount;

        System.out.println("Patient Name: " + name);
        System.out.println("Original Consultation Fee: ₹" + consultationFee);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount Payable: ₹" + finalAmount);
        System.out.println("-----------------------------------");
    }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 5 patients
        Patient[] patients = new Patient[5];

        // Input patient details
        for (int i = 0; i < patients.length; i++) {
            System.out.println("Enter details for Patient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine(); // consume newline

            patients[i] = new Patient(name, fee);
        }

        System.out.println("\n--- Consultation Billing Report ---");
        for (Patient p : patients) {
            p.displayDetails();
        }

        sc.close();
    }
}
