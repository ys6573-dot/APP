
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}


class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}


class NetBankingPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking.");
    }
}


public class PaymentDemo {
    public static void main(String[] args) {
        Payment payment;

        // Credit Card
        payment = new CreditCardPayment();
        payment.pay(2500);

        // UPI
        payment = new UPIPayment();
        payment.pay(1500);

        // Net Banking
        payment = new NetBankingPayment();
        payment.pay(5000);
    }
}
