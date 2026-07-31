class Book {

    private String title;
    private String author;
    private double price;
   
     public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        displayDetails(); 
    }

    
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
        System.out.println("----------------------");
    }
}

    class Library {
        
    public static void main(String[] args) {
    
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 499.00);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 799.50);
        Book book3 = new Book("Introduction to Algorithms", "Thomas H. Cormen", 1250.75);
    }
}
