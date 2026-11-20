package com.bootcampexcercise.module10.activity;

public class AbstractActivity {

    public static void main(String[] args) {
        Person employee = new Employee("John Smith", 33, "Quality Assurance", "Accenture", 3000.00);
        Person student = new Student("Ilya Smolin", 28, "Riga Technical University");

        //TODO 2.3.1 Call introduce from employee
        employee.introduce();

        System.out.println("-----------------------------");

        //TODO 2.3.2 Call introduce from student
        student.introduce();

        System.out.println("-----------------------------");

        //Check age validation
        try {
            employee.setAge(151);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}