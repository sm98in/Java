package com.bootcampexcercise.module5.activity;

public class Circle extends Shape {

    // TODO: Implement calculateArea method
    @Override
    public double calculateArea(double length, double breadth, double radius) {
        return Math.PI * radius * radius;
    }
    // TODO: Implement calculatePerimeter method
    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * Math.PI * radius;
    }
}
