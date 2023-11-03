package sheet;

import java.util.Scanner;

public class problem15 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int edge1, edge2, edge3;
    System.out.println("Enter three edges for a triangle ");
    edge1 = input.nextInt();
    edge2 = input.nextInt();
    edge3 = input.nextInt();

    if ((edge1 + edge2) > edge3 && (edge1 + edge3) > edge2 && (edge3 + edge2) > edge1)
      System.out.println(" the perimeter is equal : " + (edge1 + edge2 + edge3));
    else System.out.println("Invalid input");
  }
}