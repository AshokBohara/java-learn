import java.util.Scanner;

public class QuadraticEquation 
{

    
    public static void findRoots(double a, double b, double c) 
    {
    
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) 
        {
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two distinct real roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            
            double root = -b / (2 * a);
            System.out.println("The equation has one real root:");
            System.out.println("Root: " + root);
        } else {
        
            System.out.println("The equation has no real roots.");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficient a:");
        double a = scanner.nextDouble();
        System.out.println("Enter the coefficient b:");
        double b = scanner.nextDouble();
        System.out.println("Enter the coefficient c:");
        double c = scanner.nextDouble();

        if (a == 0)
         {
            System.out.println("Invalid input. Coefficient 'a' cannot be zero for a quadratic equation.");
        } else 
        {
        
            findRoots(a, b, c);
        }

        scanner.close();
    }
}
