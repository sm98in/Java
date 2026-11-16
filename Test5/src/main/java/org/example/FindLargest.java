package org.example;

public class FindLargest {
    public static void main(String[] args) {
        // 1. variables
        int number1 = 101;
        int number2 = 101;

        if (number1 > number2) {
            System.out.println("Larger value is: " + number1);
        }
        else if (number1 < number2) {
            System.out.println("Larger value is: " + number2);
        }
        else System.out.println("The numbers are equal: " + number1 + " = " + number2);
    }
}
