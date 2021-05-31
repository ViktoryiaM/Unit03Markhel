package by.epam.unit03.main;

public class Task05 {
  public static void main(String[] args) {

    double a = -3.2;
    double b = 2.45;
    double h = 0.1;
    double F;

    System.out.println("-------------------------");
    System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "F");
    System.out.println("-------------------------");

    for (double x = a; x <= b; x = x + h) {
      F = (2 * (Math.sin(x / 2) / (Math.cos(x / 2)))) + 1;
      System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, F);
    }
    System.out.println("-------------------------");
  }

}
