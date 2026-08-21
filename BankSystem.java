class BankAccount {
    // Private data members (Encapsulation)
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(int accNo, String holderName, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = holderName;
        balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount acc1 = new BankAccount(1001, "Rahul Sharma", 5000);

        // Display initial details
        acc1.displayAccountDetails();

        // Perform deposit and withdrawal
        acc1.deposit(2000);
        acc1.withdraw(1500);

        // Display updated details
        acc1.displayAccountDetails();
    }
}

