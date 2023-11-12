import java.util.Scanner;

public class problem13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an number: ");
    int number = input.nextInt();

    System.out.print("The smallest factors of " + number + " is: ");

    int factor = 2;
    while (number > 1) {
      if (number % factor == 0) {
        System.out.print(factor + " ");
        number /= factor;
      } else {
        factor++;
      }
    }
    input.close();
  }
}