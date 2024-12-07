
import java.util.Scanner;

class Prob3 
{

  public static void main(String[] args) {
    Number num = new Number();
    num.getOdd();
  }

}

class Number 
{
  private int num;

  public Number() {

    try (Scanner sc = new Scanner(System.in)) 
    {
      System.out.print("Enter a number: ");
      num = sc.nextInt();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public void getOdd() 
  {
    int count = 0;

    while (num != 0) 
    {
      int ext = num % 10;
      num = num / 10;
      if (ext % 2 != 0) 
      {
        count++;
      }
    }

    System.out.println("No. of odd digtis: " + count);
  }
}
