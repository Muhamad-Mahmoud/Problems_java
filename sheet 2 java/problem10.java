
/*
  Write a program that displays all the numbers from 100 to 1,000, ten per line, that are 
divisible by 3 and 4. Numbers are separated by exactly one space.
 */
import java.util.Scanner;

public class problem10 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    for (int i = 100; i <= 1000; i++) {
      if (i % 3 == 0 && i % 4 == 0)
        System.out.print(i + ", ");
      else
        System.out.print(i + " ");
      if (i % 10 == 0)
        System.out.println("\n");
    }
  }
}