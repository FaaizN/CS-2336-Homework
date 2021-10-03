/*
Problem: Rectangle Class
Objective: Follow the example of the Circle class in 9.2, and design a class named Rectangle to represent a rectangle
 */

import java.util.*;

public class Homework_4_Problem_1
{
    public static void main(String[] args)
    {
        //Create a Rectangle with Width 4 and height 40 and display to console
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        //Create a Rectangle with Width 3.5 and height 35.9 and display to console
        Rectangle rectangle2 = new Rectangle();
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

    }
}
    //Define the rectangle class with two constructors
    class Rectangle
    {
        double width, height;

        //Construct a Rectangle with width and height set to 1
        Rectangle()
        {
            width = 1;
            height = 1;
        }

        //Construct a Rectangle with a specified width and height
        Rectangle(double newWidth, double newHeight)
        {
            width = newWidth;
            height = newHeight;
        }

        //Return the area of the rectangle
        double getArea()
        {
            return width * height;
        }

        //Return the perimeter of the rectangle
        double getPerimeter()
        {
            return (2 * width) + (2 * height);
        }
}
