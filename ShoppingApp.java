// Abstract Product class
abstract class Product {
    protected int productId;
    protected String name;
    protected double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Method to calculate final price
    public double getFinalPrice() {
        return price - calculateDiscount();
    }

    // Display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Discount: ₹" + calculateDiscount());
        System.out.println("Final Price: ₹" + getFinalPrice());
        System.out.println("-----------------------------");
    }
}

// Electronics subclass
class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // Electronics get 10% discount
        return price * 0.10;
    }
}

// Clothing subclass
class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // Clothing gets 20% discount
        return price * 0.20;
    }
}

// Books subclass
class Books extends Product {
    public Books(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // Books get 5% discount
        return price * 0.05;
    }
}

// Driver class
public class ShoppingApp {
    public static void main(String[] args) {
        // Create product objects
        Product laptop = new Electronics(101, "Laptop", 60000);
        Product tshirt = new Clothing(102, "T-Shirt", 1500);
        Product novel = new Books(103, "Novel", 500);

        // Display details using polymorphism
        laptop.displayDetails();
        tshirt.displayDetails();
        novel.displayDetails();
    }
}

