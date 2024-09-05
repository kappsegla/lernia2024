package se.lernia.java.streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        var employeeFactory = new EmployeeFactory();
        var employees = employeeFactory.getAllEmployees();

        //employeesWithSalaryOver2Mil(employees);
        //employeeWithHighestSalary(employees);
        //Find all employees who are working on more than one project (Use filter, map, and collect methods
        var hardWorking = employees.stream()
                .filter(employee -> employee.projectCount() > 1)
                .toList();

    }

    private static void employeeWithHighestSalary(List<Employee> employees) {
        //Find the employee with the maximum salary (Use max and Comparator.comparing methods)
        employees.stream()
                .max(Comparator.comparingInt(Employee::salary))
                .ifPresent(System.out::println);
    }

    private static void employeesWithSalaryOver2Mil(List<Employee> employees) {
        //Find all employees with salary greater than a certain amount (Use filter and forEach methods
        employees.stream()
                .filter(App::salaryOver2Mil)
                .forEach(System.out::println);
    }

    private static boolean salaryOver2Mil(Employee employee) {
        return employee.salary() > 2_000_000;
    }
}

/*
        var pred = new MyPredicate();

        var pred2 = new Predicate<Employee>(){
            @Override
            public boolean test(Employee employee) {
                return employee.salary() > 2_000_000;
            }
        };

        Predicate<Employee> pred3 = employee -> employee.salary() > 2_000_000;

        Predicate<Employee> pred4 = App::salaryOver2Mil;
 */

class MyPredicate implements Predicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return employee.salary() > 2_000_000;
    }
}
