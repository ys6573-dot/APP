class Rectangle {
    
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    public double calculateArea() {
        return length * breadth;
    }

    
    public void displayArea() {
        System.out.println("The area of the rectangle is: " + calculateArea());
    }

    
    public static void main(String[] args) {
        
        Rectangle room = new Rectangle(12.5, 10.0);
        room.displayArea();
    }
}
