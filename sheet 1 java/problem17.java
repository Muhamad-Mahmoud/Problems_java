package sheet;

import java.util.Scanner;

public class problem17 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    /*
     * A leap year occurs under two conditions:
     * 1. If a year is divisible by 400, it is a leap year.
     * 2. If a year is divisible by 4 and not divisible by 100, it is also a leap year.
     */
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
      System.out.println(year + " is a leap year");
    else System.out.println(year + " is not a leap year");
  }
}