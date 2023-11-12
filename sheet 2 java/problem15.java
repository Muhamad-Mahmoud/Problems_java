
import java.util.Scanner;

public class problem15 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    double sum = 0.0;

    for (int i = 1; i <= 97; i += 2) {
      double term = (double) i / (i + 2);
      sum += term;
    }

    System.out.println("Sum is equal: " + sum);
  }
}