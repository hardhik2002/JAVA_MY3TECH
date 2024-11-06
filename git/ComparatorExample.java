package git;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
        employee.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
        employee.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
        employee.add(new Employee(1009, "Steve", 100000.00, LocalDate.of(2016, 5, 18)));
        System.out.println("Employees : " + employee);
    }
}
