class Student {
    
    String name;
    int rollNumber;
    String department;


    public Student(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    
    public void displayDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNumber);
        System.out.println("Department : " + department);
    }

    public static void main(String[] args) {
    
        Student student1 = new Student("Alex Morgan", 101, "Computer Science");

        
        student1.displayDetails();
    }
}