class Marks {
    
    private int subject1;
    private int subject2;
    private int subject3;

    
    public Marks(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    
    public int calculateTotal() {
        return subject1 + subject2 + subject3;
    }

    
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    
    public void displayResults() {
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
    }

    
    public static void main(String[] args) {
        Marks student1 = new Marks(85, 90, 80);
        student1.displayResults();
    }
}