class parent{
    public parent()
    {
        System.out.println(" HELLO WORLD with Using Super Class");
    }
}
class child extends parent
{
    public child()
    {
        super();
    }
}
public class demo4
{
    public static void main(String[] args)
     {
        child c=new child();
    }
}