import java.util.Scanner;

public class problem16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a decimal integer: ");
    int number = input.nextInt();

    System.out.print("The binary representation of " + number + " is: ");
    displayBinary(number);

    input.close();
  }

  // Method to display binary representation of a number
  public static void displayBinary(int number) {
    if (number == 0) {
      System.out.print("0");
    } else {
      // Create a StringBuilder to store the binary digits
      StringBuilder binary = new StringBuilder();

      // Convert the decimal number to binary
      while (number > 0) {
        int remainder = number % 2;
        binary.insert(0, remainder);
        number /= 2;
      }

      System.out.print(binary.toString());

    }
  }
}