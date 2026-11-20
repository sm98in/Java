package com.bootcampexcercise.module10.activity;

import java.util.List;

//TODO 2.1 Create Employee class
//TODO 2.1.1 Employee class should extend Person class
public class Employee extends Person {

    //TODO 2.1.2 Create attributes: jobTitle, company, salary
    private String jobTitle;
    private String company;
    private double salary;

    //TODO 2.1.3 Add different constructors
    public Employee() {
        super("Unknown", 1);
    }
    public Employee(String name, int age) {
        super(name, age);
    }
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    //TODO 2.1.4 Add getters and setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //TODO 2.1.5 Override method introduce of Person class
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old");
        System.out.println("I'm working as " + jobTitle + " in " + company + " and my salary is " + salary);
    }


    //TODO 4.3 Create method which returns the name of the employee with the highest salary
    public static String getHighestPaidEmp(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return null;
        }

        Employee highest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getSalary() > highest.getSalary()) {
                highest = employee;
            }
        }
        return highest.getName();
    }
}