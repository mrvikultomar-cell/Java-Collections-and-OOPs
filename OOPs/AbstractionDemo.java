// Question: Write a Java program to demonstrate abstraction using an abstract class.

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle: 78.5");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
