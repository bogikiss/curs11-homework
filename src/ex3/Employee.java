package ex3;

import ex2.Person;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private String company;
    private Integer salary;

    public Employee(String name, Integer age, String hairColor, String company, Integer salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public Integer getSalary() {
        return salary;
    }
}
