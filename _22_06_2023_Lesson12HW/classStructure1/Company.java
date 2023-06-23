package classStructure1;

import java.util.Set;

public class Company {
    private String name;
    private Set<Employee> employeeSet;

    public String getName() {
        return name;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public Set<Department> getDepartmentSet() {
        return departmentSet;
    }

    public Company(String name, Set<Employee> employeeSet, Set<Department> departmentSet) {
        this.name = name;
        this.employeeSet = employeeSet;
        this.departmentSet = departmentSet;
    }

    private Set<Department> departmentSet;
}
