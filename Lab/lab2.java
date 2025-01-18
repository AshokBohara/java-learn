//WAP to input n numbers and display in ascending order using array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab2
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store the numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)
        {
            numbers.add(scanner.nextInt());
        }
        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        System.out.println("Numbers in ascending order:");
        for (int num : numbers)
        {
            System.out.print(num + " ");
        }
    }
}
