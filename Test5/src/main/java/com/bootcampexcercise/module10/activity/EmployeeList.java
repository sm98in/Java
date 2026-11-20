package com.bootcampexcercise.module10.activity;

import java.util.ArrayList;
import java.util.List;

//TODO 4. Create EmployeeList class
public class EmployeeList {

    public static void main(String[] args) {

        //TODO 4.1 Create 5 employee objects using constructor of the Employee class
        Employee e1 = new Employee("Queen", 33, "Quality Assurance", "Accenture", 3000.00);
        Employee e2 = new Employee("Michael Jackson", 29, "Developer", "Accenture", 4500.50);
        Employee e3 = new Employee("Ed Sheeran", 41, "Team Lead", "Accenture", 6200.00);
        Employee e4 = new Employee("Dua Lipa", 26, "Junior QA", "Accenture", 3900.00);
        Employee e5 = new Employee("Bruno Mars", 35, "DevOps Engineer", "Accenture", 5100.75);

        //TODO 4.2 Create list of Employees and add all the employee objects in the list
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        //TODO 4.4 Print the statement with the highest paid employee
        System.out.println("The Employee whose salary is the highest is :" + Employee.getHighestPaidEmp(empList));
    }
}