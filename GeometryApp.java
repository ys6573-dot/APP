class Geometry {
    // Method to calculate area of a square
    double area(double side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate area of a circle
    double area(float radius) {
        return 3.14159 * radius * radius;
    }
}

public class GeometryApp {
    public static void main(String[] args) {
        Geometry g = new Geometry();

        // Calculate areas using overloaded methods
        double squareArea = g.area(5);          // Square with side 5
        double rectangleArea = g.area(10, 4);   // Rectangle 10 x 4
        double circleArea = g.area(3.5f);       // Circle radius 3.5

        // Display results
        System.out.println("Area of Square : " + squareArea);
        System.out.println("Area of Rectangle : " + rectangleArea);
        System.out.println("Area of Circle : " + circleArea);
    }
}
