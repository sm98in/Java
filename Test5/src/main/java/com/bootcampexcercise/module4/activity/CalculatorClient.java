package com.bootcampexcercise.module4.activity;

/**
 * @author
 */
public class CalculatorClient {

    public static void main(String[] args) {

        // Instantiate Calculator using the basic type constant
        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");

        // Add
        int result = normalCalc.add(4, 5);
        System.out.println("1) Add result is " + result);

        // TODO: Complete code to multiply array {2, 3, 4} using normalCalc.multiply() and print result
        int[] mul = {2, 3, 4};
        result = normalCalc.multiply(mul);
        System.out.println("2) Multiply result is " + result);

        // TODO: Write code to divide 10 and 2 using normalCalc.divide() and print result
        result = normalCalc.divide(10, 2);
        System.out.println("3) Divide result is " + result);

        // TODO: Write code to subtract 2 from 10 using normalCalc.subtract() and print result
        result = normalCalc.subtract(10, 2);
        System.out.println("4) Subtract result is " + result);
    }
}