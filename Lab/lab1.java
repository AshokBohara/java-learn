
import java.util.Scanner;


class Input {
    private double[] side = new double[3]; // Initialize the array

    // Method to input the sides of the triangle
    public void sides() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter side " + (i + 1) + ": ");
            side[i] = sc.nextDouble();
        }
    }

    // Method to calculate the area of the triangle
    public double getArea() {
        double s = (side[0] + side[1] + side[2]) / 2; // Semi-perimeter
        double a = side[0];
        double b = side[1];
        double c = side[2];
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}

class lab1{
    public static void main(String[] args) {
        Input ip = new Input();
        ip.sides(); // Get the sides of the triangle
        double area = ip.getArea(); // Calculate the area
        System.out.println("The area is: " + area);
    }
}
