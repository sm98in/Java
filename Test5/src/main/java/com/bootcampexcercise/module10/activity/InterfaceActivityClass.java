package com.bootcampexcercise.module10.activity;

public class InterfaceActivityClass {

    public static void main(String[] args) {
        // call bike methods
        Bike bike = new Bike();
        bike.start();
        bike.stop();

        // call car methods
        Car car = new Car();
        car.start();
        car.stop();
    }
}
