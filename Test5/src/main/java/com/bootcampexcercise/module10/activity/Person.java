
package com.bootcampexcercise.module10.activity;

public abstract class Person {

    //TODO Create attribute in Person class name, age
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    // Age validation: age must be from 1 to 150
    private void validateAge(int age) {
        if (age < 1 || age > 150) {
            throw new IllegalArgumentException(
                    "Age must be between 1 and 150 years, but was " + age
            );
        }
    }

    //TODO Create setters and getters for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    //TODO Define introduce method
    public void introduce() {
        System.out.println(
                "My name is " + name + " and I am " + age + " years old"
        );
    }
}
