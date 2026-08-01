
class Temperature {
    
    private double celsius;

    
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    
    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public void displayTemperatures() {
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + toFahrenheit());
    }

    
    public static void main(String[] args) {
        Temperature temp = new Temperature(30.0);
        temp.displayTemperatures();
    }
}

