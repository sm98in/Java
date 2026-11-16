package org.example;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 11; i <= 22; i++) {
            System.out.println("----- Multiplication Table for " + i + " -----");

            for (int j=1; j<=10; j++) {
                System.out.println(i + " * " + j + " = " + (i+j));
            }
        }
        System.out.println("----- End -----");
    }
}