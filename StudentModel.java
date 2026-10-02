public class StudentModel {
    private String name;
    private int[] marks;
    private int total;
    private double average;
    private String grade;

    public StudentModel(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculate();
    }

    private void calculate() {
        total = 0;
        for (int m : marks) total += m;
        average = total / (double) marks.length;
        if (average >= 90) grade = "A";
        else if (average >= 75) grade = "B";
        else if (average >= 60) grade = "C";
        else if (average >= 50) grade = "D";
        else grade = "F";
    }

    public String getResult() {
        return "Name: " + name + "\nTotal: " + total + "\nAverage: " + average + "\nGrade: " + grade;
    }
}