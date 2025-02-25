import java.util.Scanner;

class Palindrome
 {
    public static void main(String[] args)
  {
        Data d = new Data();
        d.getData();
        d.checkPalindrome();
    }
}

class Data
 {
    private String str;

    public void getData()
  {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter a string: ");
            str = sc.nextLine();
        }
         catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void checkPalindrome() 
  {
        if (str == null) 
        {
            System.out.println("No valid input received.");
            return;
        }
        
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) 
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }
    }
}
