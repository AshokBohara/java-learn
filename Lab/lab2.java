import java.io.PipedInputStream;
import java.util.*;
class palindrome
{
 String ip=new String();
 public void inputString
 {
    Scanner sc=new Scanner();
    System.out.println("Enter a String : ");
    ip= sc.nextLine();
 }
 public boolean ippalindrome()
 {
    string revString= new String();
    for(int i=0;i<ip.leangth();i++)
    {
        revString=ip.charAt(i)+revString;
    }
 }

}