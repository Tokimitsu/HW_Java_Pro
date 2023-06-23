package classStructure1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Info {
    private Map<Position, String> info;
    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        Employee employee1 = new Employee("Paul", Department.IT, Position.DEVELOPER, 9000);
        Employee employee1_1 = new Employee("Haul", Department.IT, Position.DEVELOPER, 8000);
        Employee employee2 = new Employee("Olena", Department.HR, Position.RECRUITER, 4500);
        Employee employee2_2 = new Employee("Helena", Department.HR, Position.RECRUITER, 3500);
        Employee employee3 = new Employee("Hanna", Department.ACCOUNTING, Position.LEDGER, 5900);
        Employee employee3_3 = new Employee("Wanna", Department.ACCOUNTING, Position.LEDGER, 4900);
        Employee employee4 = new Employee("Eric", Department.SALES, Position.SALES_REPRESENTATIVE, 7850);
        Employee employee4_4 = new Employee("Patric", Department.SALES, Position.SALES_REPRESENTATIVE, 5850);
        Employee employee5 = new Employee("Zorro", Department.MARKETING, Position.MANAGER, 9100);
        Employee employee5_5 = new Employee("George", Department.MARKETING, Position.MANAGER, 6100);


        employees.add(employee1);
        employees.add(employee1_1);
        employees.add(employee2);
        employees.add(employee2_2);
        employees.add(employee3);
        employees.add(employee3_3);
        employees.add(employee4);
        employees.add(employee4_4);
        employees.add(employee5);
        employees.add(employee5_5);

        checker(employee2);
        avgSalary(Department.IT);
        minSalary(Department.IT);
        maxSalary(Department.IT);
        getPromotion(employee1);
    }


    public static String checker(Employee employee) {
        String position = null;
        for (Employee person : employees) {
            if (person == employee) {
                position = person.getPosition().toString();
            }
        }
        System.out.println("Position of " + employee.getName() + " is " + position);
        return position;
    }

    public static double avgSalary(Department department) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                count++;
            }
        }
        System.out.println("Average salary in department " + department + " is : " + sum/count);
        return sum / count;
    }

    public static double minSalary(Department department) {
        double minSalary = 0;
        String name = null;
        for (int i = 0; i < employees.size() - 1; i++) {
            if (employees.get(i).getDepartment() == department) {
                if (minSalary == 0) {
                    minSalary = employees.get(i).getSalary();
                    name = employees.get(i).getName();
                } else {
                    if (employees.get(i).getSalary() < minSalary) {
                        minSalary = employees.get(i).getSalary();
                        name = employees.get(i).getName();
                    }
                }
            }
        }
            System.out.println(name + " ( " + department + " )" + " has minimum salary of : " + minSalary);
        return minSalary;
    }

    public static double maxSalary(Department department) {
        double maxSalary = 0;
        String name = null;
        for (int i = 0; i < employees.size() - 1; i++) {
            if (employees.get(i).getDepartment() == department) {
                if (maxSalary == 0) {
                    maxSalary = employees.get(i).getSalary();
                    name = employees.get(i).getName();
                } else {
                    if (employees.get(i).getSalary() > maxSalary) {
                        maxSalary = employees.get(i).getSalary();
                        name = employees.get(i).getName();
                    }
                }
            }
        }
            System.out.println(name + " ( " + department + " )" +  " has maximum salary of : " + maxSalary);
        return maxSalary;
    }

    public static void getPromotion(Employee employee) {
        System.out.println(employee.getName() + " had position " + employee.getPosition() + " and salary of : " + employee.getSalary());
        employee.setPosition(Position.RAISE);
        employee.setSalary(employee.getSalary() * 1.25);
        System.out.println("Now " + employee.getName() + " has position " + employee.getPosition() + " and salary of : " + employee.getSalary());
    }


}
