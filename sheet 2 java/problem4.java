import java.util.Scanner;

public class problem4 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    /*
     * Write a program that prompts the user to enter two strings,
     * and reports whether the second string is a substring of
     * the first string
     */
    String first = input.nextLine(); // Ahmed Mohamed
    String second = input.nextLine(); // Ahmed

    if (first.contains(second))
      System.out.println("yes");
    else
      System.out.println("NO");

    input.close();
  }
}