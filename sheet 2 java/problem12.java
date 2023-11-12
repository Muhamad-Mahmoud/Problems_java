import java.util.Scanner;

public class problem12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int Max = Integer.MIN_VALUE;
    int Count = 0;

    System.out.println("Enter integers (enter 0 to end):");

    while (true) {
      int number = input.nextInt();

      if (number == 0) {
        break;
      }

      if (number > Max) {
        Max = number;
        Count = 1;
      } else if (number == Max) {
        Count++;
      }
    }

    System.out.println("large number is: " + Max);
    System.out.println("count of show of the large number: " + Count);

    input.close();
  }
}