
package com.bootcampexcercise.module10.activity;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

//TODO 3.2 Create CalculatorTest class (min 10 tests in total)
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    //TODO 3.2.1 Min 4 test cases of add (both overloaded methods)
    @Test
    public void addTwoPositiveIntegers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void addNegativeAndPositiveIntegers() {
        assertEquals(-3, calculator.add(-4, 1));
    }

    @Test
    public void addTwoDoubles() {
        assertEquals(5.5, calculator.add(2.5, 3.0), 0.001);
    }

    @Test
    public void addDoubleAndZero() {
        assertEquals(0.1, calculator.add(0.0, 0.1), 0.001);
    }

    //TODO 3.2.1 Min 2 test cases of subtract
    @Test
    public void subtractSmallerFromBigger() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    public void subtractBiggerFromSmallerGivesNegative() {
        assertEquals(-6, calculator.subtract(4, 10));
    }

    //TODO 3.2.2 Min 2 test cases of divide
    @Test
    public void divideTenByTwo() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    public void divideByZeroIsHandledAndReturnsZero() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(output));

        try {
            int result = calculator.divide(10, 0);

            assertEquals(0, result);

            assertEquals(
                    "Error: cannot divide by zero",
                    output.toString().trim()
            );

        } finally {
            System.setOut(originalOut);
        }
    }

    //TODO 3.2.2 Min 2 test cases of multiply
    @Test
    public void multiplyTwoPositiveNumbers() throws InvalidInputException {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void multiplyByZero() throws InvalidInputException {
        assertEquals(0, calculator.multiply(0, 7));
    }

    @Test
    public void multiplyNegativeNumberThrowsInvalidInputException() {
        assertThrows(
                InvalidInputException.class,
                () -> calculator.multiply(-1, 5)
        );
    }
}
