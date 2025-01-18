import java.util.Scanner;

// Custom Exception Class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Main Class
public class lab2Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's name:");
        String name = sc.nextLine();

        System.out.println("Enter the marks:");
        int marks = sc.nextInt();

        try {
            validateMarks(marks);
            System.out.println("Student Name: " + name);
            System.out.println("Marks: " + marks);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    // Method to validate marks
    public static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        }
    }
}
