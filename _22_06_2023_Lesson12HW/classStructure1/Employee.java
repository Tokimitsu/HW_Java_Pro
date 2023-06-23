package classStructure1;

public class Employee {
    private final String name;
    Department department;
    Position position;
    private double salary;

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public Position getPosition() {
        return this.position;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, Department department, Position position, double salary) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
