// Single file version: CollegeManagementSystem.java

class Student {
    private String name;
    private int rollNumber;
    private String department;

    public Student(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department : " + department);
        System.out.println("----------------------------");
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public void displayCourseDetails() {
        System.out.println("Course Details:");
        System.out.println("Course Name : " + courseName);
        System.out.println("Course Code : " + courseCode);
        System.out.println("Credits     : " + credits);
        System.out.println("----------------------------");
    }
}

public class CollegeManagementSystem {
    public static void main(String[] args) {
        // Create Student object
        Student student = new Student("Yashvini", 101, "Computer Science");

        // Create Course object
        Course course = new Course("Object-Oriented Programming", "CS201", 4);

        // Display details
        student.displayStudentDetails();
        course.displayCourseDetails();
    }
}
