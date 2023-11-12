import java.util.Scanner;

public class problem14 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Pattern A");

    for (int row = 1; row <= 10; row++) {
      for (int column = 1; column <= row; column++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("============");
    System.out.println("\nPattern B\n");

    for (int row = 10; row >= 1; row--) {
      for (int column = 1; column <= row; column++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("============");
    System.out.println("\nPattern C");

    for (int row = 1; row <= 10; row++) {
      for (int space = 1; space <= 10 - row; space++) {
        System.out.print(" ");
      }
      for (int column = 1; column <= row; column++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("============");
    System.out.println("\nPattern D");

    for (int row = 1; row <= 10; row++) {
      for (int space = 1; space <= row - 1; space++) {
        System.out.print(" ");
      }
      for (int column = 1; column <= 10 - row + 1; column++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}