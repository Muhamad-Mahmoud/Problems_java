package sheet;

import java.util.Scanner;

public class problem7 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int x1, x2, y1, y2, distance;
    System.out.println("Enter first points : ");
    x1 = input.nextInt();
    x2 = input.nextInt();
    System.out.println("Enter second points : ");
    y1 = input.nextInt();
    y2 = input.nextInt();

    distance = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    System.out.println("The Distance is " + distance);
  }
}