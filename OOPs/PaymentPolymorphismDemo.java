// Question: Write a Java polymorphism program to demonstrate compile-time & runtime polymorphism using a payment system.
// The program should include method overriding, upcasting & downcasting, & use of the super keyword.

class Payment {
    void pay() {
        System.out.println("Payment is being processed");
    }
}

class UPI extends Payment {
    // Method Overriding
    @Override
    void pay() {
        super.pay();
        System.out.println("Payment through UPI");
    }

    void showUPIId() {
        System.out.println("UPI ID: student@upi");
    }
}

public class PaymentPolymorphismDemo {
    public static void main(String[] args) {
        // Upcasting
        Payment p = new UPI();

        // Runtime polymorphism
        p.pay();
        System.out.println();

        // Downcasting
        UPI u = (UPI) p;
        u.showUPIId();
    }
}
