package com.bootcampexcercise.module10.activity;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Add for int: " + calculator.add(2, 3));
        System.out.println("Add for double: " + calculator.add(2.5, 3.0));
        System.out.println("Subtract: " + calculator.subtract(10, 4));
        System.out.println("Divide: " + calculator.divide(10, 2));
        System.out.println("Divide by zero: " + calculator.divide(10, 0));

        //TODO 3.1.4 try catch is compulsory even if the method uses throws
        try {
            System.out.println("Multiply: " + calculator.multiply(3, 4));
            System.out.println("Multiply: " + calculator.multiply(-1, 5));
        } catch (InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}