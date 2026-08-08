class Car {
    String modelName;
    double price;

    // Constructor 1: No details
    Car() {
        modelName = "Not Provided";
        price = 0.0;
    }

    // Constructor 2: Only model name
    Car(String name) {
        modelName = name;
        price = 0.0;
    }

    // Constructor 3: Model name and price
    Car(String name, double p) {
        modelName = name;
        price = p;
    }

    // Method to display car details
    void display() {
        System.out.println("Model Name : " + modelName);
        System.out.println("Price : " + price);
        System.out.println("-------------------------");
    }
}

public class CarShowroom {
    public static void main(String[] args) {
        // Registration without details
        Car c1 = new Car();

        // Registration with only model name
        Car c2 = new Car("Swift");

        // Registration with model name and price
        Car c3 = new Car("Creta", 1500000);

        // Display all car details
        c1.display();
        c2.display();
        c3.display();
    }
}
