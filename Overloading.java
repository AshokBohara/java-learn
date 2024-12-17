//example of overloading in java 
import java.util.*;

class Overloading 
{
    public static void main(String[] args) 
    {
        Area a = new Area(); // Creating an object of the Area class

        System.out.println("Area of Circle:");
        System.out.println(a.calcArea(1)); // Circle: radius = 1

        System.out.println("Area of Rectangle:");
        System.out.println(a.calcArea(2, 4)); // Rectangle: length = 2, breadth = 4
    }
}

class Area {
    // Method to calculate the area of a circle
    public double calcArea(double radius) 
    {
        return 3.14 * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calcArea(double length, double breadth) 
    {
        return length * breadth;
    }
}
