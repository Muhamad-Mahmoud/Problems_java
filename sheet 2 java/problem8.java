/*
 * Write a program that displays the following table
 *  (note that farenheit = celsius * 9/5 + 32)
 * 35.6f = 2 * (9/5) +32
 */
import java.util.Scanner;

public class problem8 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Celsius   Fahrenheit");
    for (double i = 0; i <= 100; i += 2) {
      double farenheit = i * 9 / 5 + 32;
      System.out.println(i + "  " + farenheit);
    }
  }
}