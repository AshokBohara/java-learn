//super keyword can also be used to acess the parent constructor.
class parent
{
    public parent()
    {
        System.out.println(" HELLO WORLD with Using Super keyword");
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
