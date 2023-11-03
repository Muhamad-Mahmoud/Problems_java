package sheet;

import java.util.Scanner;

public class problem2 {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.print("Enter the length of the sides: ");
    double length = scanner.nextDouble();
    // area
    double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
    // volume
    double volume = area * length;
    // results
    System.out.println("The area of the equilateral triangle is: " + area);
    System.out.println("The volume of the equilateral triangle is: " + volume);

    scanner.close();
  }
}