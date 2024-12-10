
import java.util.Scanner;

class Prob5 {

  public static void main(String[] args) {

    string s = new string();
    s.getVowel();

  }

}

class string {
  private String str;

  public string() {

    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter a string: ");
      str = sc.nextLine();

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

  public void getVowel() {
    int vowels = 0;

    for (int i = 0; i < str.length(); i++) {
      char ext = Character.toLowerCase(str.charAt(i));
      if (Character.isLetter(ext)) {
        if (ext == 'a' || ext == 'e' || ext == 'i' || ext == 'o' || ext == 'u') {
          vowels++;
        }
      }
    }

    System.out.println("No. of vowels: " + vowels);

  }
}
