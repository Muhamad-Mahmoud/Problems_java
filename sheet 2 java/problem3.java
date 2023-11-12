
import java.util.Scanner;

public class problem3 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    /*
     * Write a program that prompts the user to enter binary digits and displays its
     * corresponding decimal value
     */
    System.out.println("Enter A binary Number (0,1)");
    String binary = input.next();
    int decimal = Integer.parseInt(binary, 2);
    System.out.print("The Numbe In decimal: " + decimal);

    input.close();
  }
}