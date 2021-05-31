package by.epam.unit03.main;

public class Task04 {
  public static void main(String[] args) {
    double a = -5;
    double b = 5;
    double h = 0.5;
    double Y;

    System.out.println("-------------------------");
    System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
    System.out.println("-------------------------");

    for (double x = a; x <= b; x = x + h) {
      Y = 5 - (Math.pow(x, 2) / 2);
      System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, Y);
    }
    System.out.println("-------------------------");
  }

}
