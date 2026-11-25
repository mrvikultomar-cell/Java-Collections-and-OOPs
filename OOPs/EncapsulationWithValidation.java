// Question: Write a Java program to demonstrate encapsulation with validation in a setter method.

class Student {
    private int marks;

    public void setMarks(int m) {
        if (m >= 0 && m <= 100) {
            marks = m;
        } else {
            System.out.println("Invalid marks");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class EncapsulationWithValidation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(85);
        System.out.println("Marks: " + s.getMarks());
        s.setMarks(120);
    }
}
