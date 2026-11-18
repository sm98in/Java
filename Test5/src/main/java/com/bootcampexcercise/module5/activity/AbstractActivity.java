package com.bootcampexcercise.module5.activity;

public class AbstractActivity {
    public static void main(String args[]) {
        // TODO: Create a Rectangle object, set color to "Blue", and print the color
        // TODO: Print the area and perimeter of the rectangle (using length = 2, breadth = 4, radius = 0)
        Rectangle myRectangle = new Rectangle();
        myRectangle.setColor("Blue");
        System.out.println("Rectangle color is: " + myRectangle.getColor());
        System.out.println("Rectangle area is: " + myRectangle.calculateArea(2, 4, 0));
        System.out.println("Rectangle perimeter is: " + myRectangle.calculatePerimeter(2, 4, 0));

        System.out.println("--------------------------");

        // TODO: Create a Circle object, set color to "Pink", and print the color
        // TODO: Print the area and perimeter of the circle (using length = 0, breadth = 0, radius = 5)
        Circle myCircle = new Circle();
        myCircle.setColor("Pink");
        System.out.println("Circle color is: " + myCircle.getColor());
        System.out.println("Circle area is: " + myCircle.calculateArea(0, 0, 5));
        System.out.println("Circle perimeter is: " + myCircle.calculatePerimeter(0, 0, 5));
    }
}