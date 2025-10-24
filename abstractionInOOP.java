//CORE JAVA ---- PITP 2 ---- Abstraction In OOP ----- 24/10/2025(Friday)
//Muhammad Abdul Hadi Khawaja

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method - har subclass apni implementation degi
    abstract void pay();

    // Normal method - sab me same kaam karega
    void paymentReceipt() {
        System.out.println("Payment of $" + amount + " successful. Receipt generated.");
    }
}

// CreditCard payment
class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

// PayPal payment
class PayPalPayment extends Payment {
    PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Paid $" + amount + " using PayPal");
    }
}

// Bank Transfer payment
class BankTransferPayment extends Payment {
    BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Paid $" + amount + " using Bank Transfer");
    }
}

// Main class
public class abstractClass {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(100);
        Payment p2 = new PayPalPayment(250);
        Payment p3 = new BankTransferPayment(500);

        // Polymorphism: same reference type, different behaviors
        p1.pay();
        p1.paymentReceipt();

        System.out.println();

        p2.pay();
        p2.paymentReceipt();

        System.out.println();

        p3.pay();
        p3.paymentReceipt();
    }
}
