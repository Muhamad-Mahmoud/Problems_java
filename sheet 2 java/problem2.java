
import java.util.Scanner;

public class problem2 {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    /*
     * Write a program that prompts the user to enter a string and displays its
     * length and its last character.
     */
    System.out.println("Enter an string Number");
    String str = scanner.next();
    System.out.println("This Word contain: " + str.length() + " Characters. \nThe last Char is : " + str.charAt(str.length() - 1));

    scanner.close();
  }
}