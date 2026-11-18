package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {

    // TODO: Implement calculateArea method
    @Override
    public double calculateArea(double length, double breadth, double radius) {
        return length * breadth;
    }
    // TODO: Implement calculatePerimeter method
    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * (length + breadth);
    }
}