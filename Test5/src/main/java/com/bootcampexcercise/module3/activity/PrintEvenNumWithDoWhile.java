package com.bootcampexcercise.module3.activity;

public class PrintEvenNumWithDoWhile {
    public static void main(String[] args) {
        int i = 2;

        // do-while
        do {
            System.out.println(i);
            i = i + 2;
            // or i += 2;

        } while (i <= 20);
    }
}
