import java.util.Scanner;

class Prob2 {

  public static void main(String[] args) {

    Data d = new Data();
    d.getRes();

  }

}

class Data {
  private String str;

  public Data() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a string: ");
      str = sc.nextLine();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public boolean checkPalin() {
    String rev = "";

    for (int i = (str.length() - 1); i >= 0; i--) {
      char ext = str.charAt(i);
      rev = rev + ext;
    }

    if (rev.equalsIgnoreCase(str)) {
      return true;
    } else {
      return false;
    }
  }

  public void getRes() {

    if (checkPalin()) {
      System.out.println("Entered String is palindrome!!");
    } else {
      System.out.println("Entered String is not palindrome");
    }

  }

}
