// Employee class with encapsulated attributes and methods
class Employee {
    // Private attributes
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter method for name attribute
    public String getName() {
        return name;
    }

    // Setter method for salary attribute
    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
        // if (salary >= 0) {

        // } else {
        // System.out.println("Salary cannot be negative.");
        // }
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Main class to demonstrate encapsulation
public class encap {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", -5.0000);

        // Display employee information
        employee.displayInfo();

        // Update employee salary
        employee.setSalary(343);

        // Display updated employee information
        employee.displayInfo();
    }
}
