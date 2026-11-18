package org.example;

public class FindInArray {
    public static void main(String[] args) {
        int[] numbers = {100, 1, 4, 15};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                // than new max
                max = numbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + max);
    }
}