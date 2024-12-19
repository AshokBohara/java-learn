// example of class and object in java 
public class Person 
{
    // Fields
    String name;
    int age;

    // Constructor
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) 
    {
        // Creating an object of the Person class
        Person person = new Person("Ashok", 20);
        person.displayDetails(); // Calling the method
    }
}
