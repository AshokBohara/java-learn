import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[]data=new int[10];
        System.out.println("enter 10 number");
        for (int i=0;i<10;i++)
        {
            data[i]=sc.nextInt();

        }
        System.out.println("the elements in the array are ");
        for(int i=9;i>=0;i--)
        {
            System.out.println(data[i]+"\t");
        }
    }
}