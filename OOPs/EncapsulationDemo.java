// Question: Write a Java program to demonstrate encapsulation using private data members and public getter & setter methods.

class Student {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        System.out.println("Age = " + s.getAge());
    }
}
