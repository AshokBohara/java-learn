//example of abstract base class in java for displaying the area of circle and rectangle.
import java.util.Scanner;

abstract class Shape 
{
    protected int length, breadth, radius;

    abstract public void setdimension();

    abstract public void displayarea();
}

class Circle extends Shape 
{
    public void setdimension() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = sc.nextInt();
    }

    public void displayarea() 
    {
        System.out.println("Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape 
{
    public void setdimension() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        length = sc.nextInt();
        breadth = sc.nextInt();
    }

    public void displayarea() 
    {
        System.out.println("Area: " + (length * breadth));
    }
}

class Demoo 
{
    public static void main(String[] args) 
    {
        Shape s;

        Rectangle r = new Rectangle();
        s = r;
        s.setdimension();
        s.displayarea();

        Circle c = new Circle();
        s = c;
        s.setdimension();
        s.displayarea();
    }
}
