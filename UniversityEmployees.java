// Parent class
class Employee {
    protected String name;
    protected int empId;
    protected double basicSalary;

    // Constructor
    public Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    // Method to be overridden
    public double calculateSalary() {
        return basicSalary;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("-----------------------------");
    }
}

// Child class: Professor
class Professor extends Employee {
    public Professor(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    @Override
    public double calculateSalary() {
        // Professors get 50% extra allowance
        return basicSalary + (0.5 * basicSalary);
    }
}

// Child class: LabAssistant
class LabAssistant extends Employee {
    public LabAssistant(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    @Override
    public double calculateSalary() {
        // Lab Assistants get 20% extra allowance
        return basicSalary + (0.2 * basicSalary);
    }
}

// Child class: AdministrativeStaff
class AdministrativeStaff extends Employee {
    public AdministrativeStaff(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    @Override
    public double calculateSalary() {
        // Administrative staff get 30% extra allowance
        return basicSalary + (0.3 * basicSalary);
    }
}

// Driver class
public class UniversityEmployees {
    public static void main(String[] args) {
        // Create different employee objects
        Employee prof = new Professor("Dr. Meera", 101, 50000);
        Employee labAsst = new LabAssistant("Arjun", 102, 25000);
        Employee admin = new AdministrativeStaff("Kavitha", 103, 30000);

        // Display salaries
        prof.displayDetails();
        labAsst.displayDetails();
        admin.displayDetails();
    }
}

