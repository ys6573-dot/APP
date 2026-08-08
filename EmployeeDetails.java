class Employee {
    // Data members
    int empId;
    String empName;
    double salary;


    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    
    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        // Create Employee object with sample input
        Employee e1 = new Employee(101, "Rahul", 45000);

        // Display employee details
        e1.display();
    }
}
