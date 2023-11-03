package sheet;

import java.util.Scanner;

public class problem1 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    // switch from miles to kilometers
    double distance = 38.4;
    /*
     * switch from time to hours
     * 4/6 + 7/720 == 487/720 + 1 = 1.676388888888889
     */
    double time = 1.676388888888889;
    // the average speed = all distance / all time
    double average = distance / time;
    System.out.println("The avarege is equal: " + average);

    // Another Way
    System.out.println("The avarege is equal: " + (38.4 / 1.676388888888889));

  }
}