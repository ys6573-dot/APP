import java.util.Scanner;

// Abstract Shape class
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Driver class
public class GraphicsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = sc.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                shape = new Rectangle(length, breadth);
                break;
            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                shape = new Triangle(base, height);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        // Display area using polymorphism
        System.out.println("Area of selected shape: " + shape.calculateArea());

        sc.close();
    }
}

