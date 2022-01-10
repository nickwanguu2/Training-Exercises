package Jan10.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Nick", "Wang", "nick.wang.uu@gmail.com"));
        employees.add(new Employee(102, "Test", "Employee", "test.employee@gmail.com"));
        employees.add(Employee.parseEmployee("103, Test2, Employee, test.empoloyee2@ryder.com"));

        Employee emp102 = new Employee(102, "N", "W", "Z");
        employees.add(emp102);

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            System.out.println(employee.toCSV());
        }
    }
}
