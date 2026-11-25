// Question: Write a Java program to demonstrate abstraction using a real-life payment system.

abstract class Payment {
    abstract void pay();
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment through UPI");
    }
}

public class PaymentAbstractionDemo {
    public static void main(String[] args) {
        UPI u = new UPI();
        u.pay();
    }
}
