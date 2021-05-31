package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double X = 0;
    double Y = 0;
    double Z = 0;
    String Command;
    char Operation;
    do {
      System.out.print("> ");

      if (sc.hasNextDouble()) {
        X = sc.nextDouble();
        System.out.println("Вы ввели операнд Х : " + X);
      } else if (sc.hasNext("#")) {
        return;
      }

      System.out.print("> ");

      if (sc.hasNextDouble()) {
        Y = sc.nextDouble();
        System.out.println("Вы ввели операнд Y : " + Y);
      } else if (sc.hasNext("#")) {
        return;
      }
      sc = new Scanner(System.in);
      System.out.print("> ");
      Command = sc.nextLine();
      if (Command.length() == 0 || Command.length() > 1) {
        System.out.println("Неверная операция!!!");
      } else {
        Operation = Command.charAt(0);// convert string to char
        switch (Operation) {
          case '+':
            Z = X + Y;
            System.out.println(Z);
            break;
          case '-':
            Z = X - Y;
            System.out.println(Z);
            break;
          case '/':
            if (Y == 0) {
              System.out.println("На ноль делить нельзя!");
            } else {
              Z = X / Y;
              System.out.println(Z);
            }
            break;
          case '*':
            Z = X * Y;
            System.out.println(Z);
            break;
          case '#':
            return;
          default:
            System.out.println("Неверная операция!!!");
        }
      }
    }while(true);
  }
}
