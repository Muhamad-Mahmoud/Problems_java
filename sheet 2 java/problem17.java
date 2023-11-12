
/*
 * Write a program that prompts the user to enter a string and displays the string in reverse 
order. For example if the user entered ABCD, the program will display DCBA
 */
import java.util.Scanner;

public class problem17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String userInput = input.nextLine();

    String reversedString = new StringBuilder(userInput).reverse().toString();

    System.out.println("Reversed string: " + reversedString);

    input.close();
  }
}