package com.bootcampexcercise.module2.activity;

public class NumToWords {
    public static void main(String[] args) {

        System.out.println(getWord(5));
    }

    public static String getWord(int x) {
        String word = "";

        // using switch for checking number
        switch (x) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
            case 10:
                word = "Ten";
                break;
            default:
                // if number over our period 1 to 10, than error
                word = "please enter only from 1 to 10";
                break;
        }
        return word;
    }
}
