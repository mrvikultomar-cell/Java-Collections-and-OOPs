// Question: Write a Java program to demonstrate encapsulation using an Employee class having employee ID, name, and salary as private data members.
// Use public getter and setter methods to access and modify the data. Add validation to ensure that the salary cannot be negative.

class Employee {
    private int empId;
    private String name;
    private double salary;

    public void setEmpId(int id) {
        empId = id;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        if (s >= 0) {
            salary = s;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpId(101);
        e.setName("Rahul");
        e.setSalary(35000);

        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee Salary: " + e.getSalary());

        e.setSalary(-5000);
    }
}
