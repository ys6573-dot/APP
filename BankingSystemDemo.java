
// ===== Account Management =====
class Account {
    String accountNumber;
    String holderName;
    double balance;

    Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name   : " + holderName);
        System.out.println("Balance       : ₹" + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type  : Savings");
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("----------------------------");
    }
}

// CurrentAccount subclass
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type  : Current");
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
        System.out.println("----------------------------");
    }
}

// ===== Payment Interfaces =====
interface Payment {
    void pay(double amount);
}

interface SecurePayment extends Payment {
    void verifyPayment();
}

// Tagging interface
interface OnlineTransaction {}

// UPIPayment implements SecurePayment + OnlineTransaction
class UPIPayment implements SecurePayment, OnlineTransaction {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }

    @Override
    public void verifyPayment() {
        System.out.println("UPI Payment verified successfully.");
    }
}

// CardPayment implements Payment + OnlineTransaction
class CardPayment implements Payment, OnlineTransaction {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Card.");
    }
}

// ===== Main Class =====
public class BankingSystemDemo {
    public static void main(String[] args) {
        // Runtime polymorphism with Account reference
        Account acc1 = new SavingsAccount("S101", "Yashvini", 50000, 4.5);
        Account acc2 = new CurrentAccount("C202", "Arjun", 75000, 20000);

        acc1.displayDetails();
        acc2.displayDetails();

        // Payment system demonstration
        Payment payment1 = new UPIPayment();
        Payment payment2 = new CardPayment();

        // UPI Payment with verification
        if (payment1 instanceof SecurePayment) {
            SecurePayment sp = (SecurePayment) payment1;
            sp.verifyPayment();
            sp.pay(2500);
        }

        // Card Payment
        payment2.pay(5000);

        // Checking tagging interface
        if (payment1 instanceof OnlineTransaction) {
            System.out.println("UPI Payment is an Online Transaction.");
        }
        if (payment2 instanceof OnlineTransaction) {
            System.out.println("Card Payment is an Online Transaction.");
        }
    }
}
