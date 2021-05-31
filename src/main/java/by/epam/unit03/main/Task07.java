package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("> ");
    char c = sc.next().charAt(0);
    int number = 0;
    if (c == 'I') {
      number = 1;
      System.out.println(number);
    } else if (c == 'V') {
      number = 5;
      System.out.println(number);
    } else if (c == 'X') {
      number = 10;
      System.out.println(number);
    } else if (c == 'L') {
      number = 50;
      System.out.println(number);
    } else if (c == 'C') {
      number = 100;
      System.out.println(number);
    } else if (c == 'D') {
      number = 500;
      System.out.println(number);
    } else if (c == 'M') {
      number = 1000;
      System.out.println(number);
    } else {
      number = 0;
      System.out.println(number);
    }

  }
}
