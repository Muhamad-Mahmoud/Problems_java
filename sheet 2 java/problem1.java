import java.util.Scanner;

public class problem1 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    /*
     * Write a program that receives a character and displays its ASCII code
     * (an integer between 0 and 127).
     */
    System.out.print("enter a character : ");
    char ch = input.next().charAt(0);

    System.out.println("The ASCII code of " + ch + " is " + (int) ch);

    input.close();
  }
}