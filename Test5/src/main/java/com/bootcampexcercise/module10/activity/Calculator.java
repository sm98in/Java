package com.bootcampexcercise.module10.activity;

//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;

//TODO 3.1 Create Calculator class
public class Calculator {

    //TODO 3.1.1 Create 2 add methods (method overloading - name of method is the same)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    //TODO 3.1.2 Create subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    //TODO 3.1.3 Create divide method (java exception, try and catch of invalid inputs)
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero");
            return 0;
        }
    }

    //TODO 3.1.4 Create multiply method (customized exception for invalid input)
    public int multiply(int a, int b) throws InvalidInputException {
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Sorry, negative numbers only for pay. Not allowed: a=" + a + ", b=" + b);
        }
        return a * b;
    }
}