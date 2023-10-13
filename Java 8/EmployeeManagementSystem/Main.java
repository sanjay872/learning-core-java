package EmployeeManagementSystem;

import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        EmployeeSystem employeeSystem=new EmployeeSystem();
        List<Employee> employeeList=employeeSystem.getEmployeeList();

        //How many male and female employees are there in the organization?
        //System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())));

        //Print the name of all departments in the organization?
        //employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //What is the average age of male and female employees?
        //System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge))));

        //Get the details of highest paid employee in the organization?
        //System.out.println(employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)));

        //Get the names of all employees who have joined after 2015?
        //System.out.println(employeeList.stream().filter(employee -> employee.getYearOfJoining()>2015).map(Employee::getName).collect(Collectors.toList()));

        // Count the number of employees in each department?
        //System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));

        //What is the average salary of each department?
        //System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))));

        //Get the details of the youngest male employee in the product development department?
        // System.out.println(employeeList.stream()
        // .filter(employee -> employee.getGender().equals("Male") && employee.getDepartment().equals("Product Development"))
        // .min(Comparator.comparingInt(Employee::getAge)));

        //Who has the most working experience in the organization?
        //System.out.println(employeeList.stream().min(Comparator.comparingDouble(Employee::getYearOfJoining)));

        // How many male and female employees are there in the sales and marketing team?
        // System.out.println(employeeList.stream()
        // .filter(employee -> employee.getDepartment().equals("Sales And Marketing"))
        // .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())));

        //What is the average salary of male and female employees?
        //System.out.println(employeeList.stream()
        //.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))));

        // List down the names of all employees in each department?
        //System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)));

        // What is the average salary and total salary of the whole organization?
        //System.out.println(employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        //System.out.println(employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge()>25)));

        // Who is the oldest employee in the organization? What is his age and which department he belongs to?
        System.out.println(employeeList.stream().max(Comparator.comparingInt(Employee::getAge)));


    }
}
