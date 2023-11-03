package sheet;

import java.util.Scanner;

public class problem4 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int number, fdigit, ldigit, centerdigit, twodigit;
    System.out.print("Enter an integer between 0 and 1000: ");
    number = input.nextInt();

    if (number < 10)
      System.out.println(number);
    else if (number < 100) {
      fdigit = number / 10;
      ldigit = number % 10;
      System.out.printf("the multiplication of all its digits (%d * %d ) = %d", fdigit, ldigit, (fdigit * ldigit));
    } else if (number < 1000) {
      // ex- 456
      twodigit = number / 10; // 45
      fdigit = twodigit / 10; // 4
      centerdigit = twodigit % 10; // 5
      ldigit = number % 10; // 6
      System.out.printf("the multiplication of all its digits ( %d * %d * %d ) = %d", fdigit, centerdigit, ldigit,
          (fdigit * centerdigit * ldigit));
    }
  }
}