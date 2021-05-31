package by.epam.unit03.main;

public class Task06 {

  public static void main(String[] args) {
    int a = 50020;
    int b = 2311;
    int c = b;
    int r1 = 0;
    int r2 = 0;
   do {
     b = c;
     r1 = a % 10;
     a = a / 10;
     do {
       r2 = b % 10;
       if (r2 == r1){
         System.out.println("Общая цифра: " + r2);
       }
       b = b / 10;
     }
     while (b > 0);
   }
     while (a > 0);



  }
}