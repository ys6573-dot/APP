import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double monthlySalary;

    // Constructor
    Employee(int id, String name, double monthlySalary) {
        this.empId = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    // Method to calculate annual salary
    double annualSalary() {
        return monthlySalary * 12;
    }

    // Method to calculate bonus
    double calculateBonus() {
        return (monthlySalary >= 30000) ? annualSalary() * 0.10 : 0;
    }

    // Method to check eligibility
    String bonusEligibility() {
        return (monthlySalary >= 30000) ? "Eligible" : "Not Eligible";
    }

    // Display details
    void displayDetails() {
        double annual = annualSalary();
        double bonus = calculateBonus();
        String eligibility = bonusEligibility();

        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: ₹" + monthlySalary);
        System.out.println("Annual Salary: ₹" + annual);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Bonus Eligibility: " + eligibility);
        System.out.println("-----------------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 5 employees
        Employee[] employees = new Employee[5];

        // Input employee details
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Monthly Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        System.out.println("\n--- Employee Report ---");
        for (Employee e : employees) {
            e.displayDetails();
        }

        sc.close();
    }
}

