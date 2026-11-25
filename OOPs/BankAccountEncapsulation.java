// Question: Write a Java program to demonstrate encapsulation using a BankAccount class.

class BankAccount {
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountEncapsulation {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(5000);
        System.out.println("Balance: " + b.getBalance());
    }
}
