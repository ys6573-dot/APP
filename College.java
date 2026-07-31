class Student {
    private String name;
    private int rollNumber;


    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("------------------------");
    }
} 

public class College {
    public static void main(String[] args) {
        Student s1 = new Student("Yashvini", 101);
        Student s2 = new Student("Rahul", 102);
        Student s3 = new Student("Priya", 103);

        s1.display();
        s2.display();
        s3.display();
    }
}
