class Employee {

    private String name;
    private int id;
    private String department;

    
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, "HR");
        Employee emp2 = new Employee("Bob", 102, "IT");

        emp1.displayDetails();
        emp2.displayDetails();
    }
}