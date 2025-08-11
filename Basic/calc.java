// Simple Calculator Program in Java
import java.util.Scanner;
class Calc {
    public static void main(String[] args) {
        int n1, n2, ch, cal;

        Scanner r = new Scanner(System.in);

        // Step 1: Get numbers
        System.out.print("Enter two numbers: ");
        n1 = r.nextInt();
        n2 = r.nextInt();

        // Step 2: Show menu before asking choice
        System.out.println("Select operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Enter your choice: ");
        ch = r.nextInt();

        // Step 3: Perform calculation
        if (ch == 1) {
            cal = n1 + n2;
            System.out.println("Sum is: " + cal);
        } else if (ch == 2) {
            cal = n1 - n2;
            System.out.println("Difference is: " + cal);
        } else if (ch == 3) {
            cal = n1 * n2;
            System.out.println("Product is: " + cal);
        } else if (ch == 4) {
            if (n2 != 0) {
                cal = n1 / n2;
                System.out.println("Quotient is: " + cal);
            } else {
                System.out.println("Division by zero is not allowed");
            }
        } else {
            System.out.println("Invalid operation selected");
        }

        System.out.println("Thank you for using the calculator!");
        r.close();
    }
}
