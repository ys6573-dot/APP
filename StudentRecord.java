class StudentRecord {
    private String name;
    private int age;

    public StudentRecord(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("Alice", 15);
        StudentRecord s2 = new StudentRecord("Bob", 16);

        s1.displayDetails();
        s2.displayDetails();
    }
}
