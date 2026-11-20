
package com.bootcampexcercise.module10.activity;

//TODO 2.2 Create class Student extends Person class
public class Student extends Person {

    //TODO 2.2.1 Create attribute schoolName*
    private String schoolName;

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    //TODO 2.2.2 Create getters and setters for attribute
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //TODO 2.2.4 Override method introduce of Person
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I study at " + schoolName);
    }
}
