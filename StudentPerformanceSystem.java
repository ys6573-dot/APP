import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[3];
    double attendance;

    // Constructor
    Student(int rollNo, String name, int[] marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    // Method to evaluate performance
    void evaluate() {
        int total = 0;
        for (int m : marks) total += m;
        double average = total / 3.0;

        // Decision-making using ternary operator
        String result = (average >= 50) ? "Pass" : "Fail";
        String scholarship = (average >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";
        String performance = (average >= 85) ? "Excellent" : "Good";

        // Display details
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
        System.out.println("-----------------------------------");
    }

    double getAverage() {
        int total = 0;
        for (int m : marks) total += m;
        return total / 3.0;
    }
}

public class StudentPerformanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 5 students
        Student[] students = new Student[5];

        // Input details
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            System.out.print("Attendance Percentage: ");
            double attendance = sc.nextDouble();

            students[i] = new Student(rollNo, name, marks, attendance);
        }

        System.out.println("\n--- Student Performance Report ---");
        double highestAvg = -1;
        Student topStudent = null;

        for (Student s : students) {
            s.evaluate();
            double avg = s.getAverage();
            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = s;
            }
        }

        // Display topper
        System.out.println("\n*** Top Performer ***");
        System.out.println("Roll No: " + topStudent.rollNo);
        System.out.println("Name: " + topStudent.name);
        System.out.println("Highest Average: " + highestAvg);

        sc.close();
    }
}