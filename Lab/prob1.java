import java.util.Scanner;

class Prob1 {

  public static void main(String[] args) {

    Triangle t = new Triangle();
    t.getArea();

  }

}

class Triangle {
  private double a, b, c;

  public Triangle() {

    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter sides of triangle: ");
      a = sc.nextDouble();
      b = sc.nextDouble();
      c = sc.nextDouble();

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public void getArea() {

    double s, area;
    s = (a + b + c) / 2;
    area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    System.out.println("Area: " + area);

  }
}
