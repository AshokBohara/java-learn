import java.util.Scanner;

// Base class
class User
 {
    // Fields to store user details
    String name;
    String address;
    int age;

    // Method to get user details (to be overridden)
    void getUserValue()
     {
        System.out.println("Getting user details from the base class.");
    }

    // Method to display user details (to be overridden)
    void displayUserDetail()
     {
        System.out.println("Displaying user details from the base class.");
    }
}

// Subclass that overrides methods
class SpecificUser extends User
 {
    // Override getUserValue() to get user details
    @Override
    void getUserValue()
     {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter your address: ");
        this.address = scanner.nextLine();

        System.out.print("Enter your age: ");
        this.age = scanner.nextInt();

        scanner.close(); // Close the scanner
    }

    // Override displayUserDetail() to display user details
    @Override
    void displayUserDetail()
     {
        System.out.println("\nUser Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
    }
}

// Main class
public class main
 {
    public static void main(String[] args)
     {
        // Create an object of the subclass
        SpecificUser user = new SpecificUser();

        // Call overridden methods
        user.getUserValue(); // Get user details
        user.displayUserDetail(); // Display user details
    }
}