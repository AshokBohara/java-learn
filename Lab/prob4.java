
import java.util.Scanner;

class Prob4 {

  public static void main(String[] args) {

    FourData s = new FourData();
    s.convCase();

  }

}

class FourData {
  private String str;

  public FourData() {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a string: ");
      str = sc.nextLine();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public void convCase() {
    String converted = "";
    for (int i = 0; i < str.length(); i++) {
      char ext = str.charAt(i);
      if (i % 2 == 0) {
        converted = converted + Character.toUpperCase(ext);
      } else {
        converted = converted + Character.toLowerCase(ext);
      }
    }

    System.out.println("Case converted string: " + converted);
  }
}
