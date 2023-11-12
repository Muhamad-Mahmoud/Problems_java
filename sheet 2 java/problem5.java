import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class problem5 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    String SSecurity;
    /*
     * Write a program that prompts the user to enter a Social Security
     * number in the format DDD-DD-DDDD, where D is a digit.
     * Your program should check whether the input is valid.
     */

    System.out.println("Enter a Social Security ");
    SSecurity = input.nextLine();

    Pattern pattern = Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$");
    Matcher match = pattern.matcher(SSecurity);

    if (match.matches())
      System.out.println("Valid Social Security number.");
    else
      System.out.println("Invalid Social Security number.");

  }
}