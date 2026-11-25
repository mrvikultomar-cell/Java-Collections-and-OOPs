// Question: Write a Java program to demonstrate upcasting and downcasting using a parent class Animal and a child class Dog.

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class UpcastingDowncastingDemo {
    public static void main(String[] args) {
        // Upcasting
        Animal a = new Dog();
        a.eat();

        // Downcasting
        Dog d = (Dog) a;
        d.eat();
        d.bark();
    }
}
