package com.bootcampexcercise.module7.activity;

// Needs to be completed

// 1 - Extend this class from Exception class

import javax.xml.namespace.QName;

public class CustomExceptionActivity extends Exception {

    // 2 - Override getMessage() and provide the following message:

    // "You are not allowed to use this program"
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }

}