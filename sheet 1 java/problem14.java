package sheet;

import java.util.Scanner;

public class problem14 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int waightPounds;
    System.out.println("Enter the weight of the package (in pounds)");
    waightPounds = input.nextInt();

    if (waightPounds > 20)
      System.out.println("the package cannot be shipped.");
    else {
      double cost = 0;
      if (waightPounds > 0 && waightPounds <= 2)
        cost = 2.5;
      else if (waightPounds > 2 && waightPounds <= 4)
        cost = 4.5;
      else if (waightPounds > 4 && waightPounds <= 10)
        cost = 7.5;
      else if (waightPounds > 10 && waightPounds <= 20)
        cost = 10.5;
      System.out.println("The cost of package Is : " + cost * waightPounds + "$ ");
    }
  }
}