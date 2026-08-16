class Ride {
    int rideNumber;
    String rideName;

    // Constructor
    Ride(int number, String name) {
        this.rideNumber = number;
        this.rideName = name;
    }

    // Method to display ride activity pattern
    void displayActivity() {
        System.out.print(rideName + " : ");
        for (int i = 1; i <= rideNumber; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public class AmusementPark {
    public static void main(String[] args) {
        // Array of 5 rides
        Ride[] rides = new Ride[5];

        // Initialize rides with names and activity levels
        rides[0] = new Ride(1, "Roller Coaster");
rides[1] = new Ride(2, "Ferris Wheel");
rides[2] = new Ride(3, "Bumper Cars");
rides[3] = new Ride(4, "Water Ride");
rides[4] = new Ride(5, "Haunted House");

        // Display activity patterns for each ride
        System.out.println("--- Amusement Park Ride Activity Patterns ---");
        for (Ride r : rides) {
            r.displayActivity();
        }
    }
}