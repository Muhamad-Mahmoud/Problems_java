package sheet;

import java.util.Scanner;

public class problem13 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int number, fdigit, ldigit;
    System.out.print("Enter a Number contain Three digits: ");
    number = input.nextInt();

    fdigit = number / 100; // first digit
    ldigit = number % 10; // last digit

    if (fdigit == ldigit)
      System.out.println(number + " is a palindrome");
    else
      System.out.println(number + " is not a palindrome");
  }
}