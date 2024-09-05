package se.lernia.java.streams;

import java.util.List;

public class App {
    public static void main(String[] args) {
        var employeeFactory = new EmployeeFactory();
        var employees = employeeFactory.getAllEmployees();

        employeesWithSalaryOver2Mil(employees);



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
