package sheet;

import java.util.Scanner;

public class problem3 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    // read subtotal
    System.out.println("Enter Subtotal");
    double subTotal = input.nextDouble();
    // read gratuity rate
    System.out.println("Enter gratuity rate");
    double gratuityRate = input.nextDouble();

    // display Gratuity
    double gratuity = subTotal * (gratuityRate / 100);
    System.out.println("The gratuity = " + gratuity);
    // display the total
    System.out.println("The total = " + (subTotal + gratuity));
  }
}