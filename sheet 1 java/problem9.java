package sheet;

import java.util.Scanner;

public class problem9 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int result, swap;
    int number1 = (int) (Math.random() * 10);
    int number2 = (int) (Math.random() * 10);

    if (number2 > number1) {
      swap = number2;
      number2 = number1;
      number1 = swap;
    }

    System.out.printf("What is %d - %d = ", number1, number2);
    result = input.nextInt();
    if (result == (number1 - number2))
      System.out.println("Your Result is Correct");
    else
      System.out.println("Your Result is Worng");
  }

}