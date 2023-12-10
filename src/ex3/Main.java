package ex3;

import ex2.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Oliver Brown", 33, "blonde", "Audi", 5000);
        Employee employee2 = new Employee("Jessica Hudson", 40, "blonde", "BMW", 4000);
        Employee employee3 = new Employee("Maria Brooks", 29, "brunette", "Audi", 3500);
        Employee employee4 = new Employee("Jake Wolf", 50, "black", "BMW", 6100);
        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        listOfEmployees.add(employee3);
        listOfEmployees.add(employee4);

        System.out.println(listOfEmployees);

        //3.2
        Map<String, List<Employee>> groupByCompany = listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getCompany));
        System.out.println(groupByCompany);

        //3.1
        List<Employee> salaryBiggerThan4500 = listOfEmployees.stream().filter(employee -> employee.getSalary() > 4500).toList();
        System.out.println("They have a salary bigger than 4500: " + salaryBiggerThan4500);

        //3.3
        Integer sumOfSalaries = listOfEmployees.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println("The sum of all salaries: " + sumOfSalaries);

        //3.4
        Employee biggesttSalary = listOfEmployees.get(0);
        for (int i = 0; i < listOfEmployees.size(); i++) {
            if (listOfEmployees.get(i).getSalary() > biggesttSalary.getSalary()) {
                biggesttSalary = listOfEmployees.get(i);
            }
        }
        System.out.println("The company that gives the biggest salary: " + biggesttSalary.getCompany());

    }

}
