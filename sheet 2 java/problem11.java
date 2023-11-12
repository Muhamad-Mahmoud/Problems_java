
/*
 * Use a while loop to find the smallest integer n such that n3
is greater than 12,000.
 */
import java.util.Scanner;

public class problem11 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int n = 1;

    while (Math.pow(n, 3) <= 12000) {
      n++;
    }

    System.out.println("The smallest integer n : " + n);
  }
}