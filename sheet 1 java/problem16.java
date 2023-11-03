package sheet;

import java.util.Scanner;

public class problem16 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    /*
     * The distance formula is given by:
     * distance = √((x2 - x1)^2 + (y2 - y1)^2)
     */
    int x1, x2 = 0, y1, y2 = 0, distance;
    System.out.println("Enter two points : (x,y) ");
    x1 = input.nextInt();
    y1 = input.nextInt();

    distance = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    System.out.println("The Distance is " + distance);

    if (distance <= 10)
      System.out.printf("(%d, %d) is inside the circle  ",x1,y1);
    else
      System.out.printf("The Points (%d, %d) is Outside the circle  ",x1,y1);
  }
}