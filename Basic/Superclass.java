//use of super keyboard..
class Superclass
 {
    void message()
     {
        System.out.println("Welcome");
    }
}

class Students extends Superclass {
    void message()
     {
        System.out.println("Welcome to Java");
    }

    void display()
     {
        message();
        super.message();
    }

    public static void main(String[] args)
     {
        Students s = new Students();
        s.display();
    }
}
