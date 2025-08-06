import java.util.Scanner;

interface interfacee
{
    void getUserValue();
    void displayUserDetail();
}

class Demooo implements interfacee {

    String name, address;
    int age;

    public void getUserValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your address:");
        address = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
    }

    public void displayUserDetail() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Demooo user = new Demooo();
        user.getUserValue();
        user.displayUserDetail();
    }
}