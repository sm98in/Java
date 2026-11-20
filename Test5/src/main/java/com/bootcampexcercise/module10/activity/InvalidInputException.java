package com.bootcampexcercise.module10.activity;

//TODO 3.1.4 Customized exception for invalid input
public class InvalidInputException extends Exception {

    public InvalidInputException(String message) {
        super(message);
    }
}