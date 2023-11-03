package sheet;

import java.util.Scanner;

public class problem5 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int minutes, days, year, daysforyear;
    System.out.print("Enter Minutes: ");
    minutes = input.nextInt();

    days = (minutes / (60 * 24));
    year = days / 365;
    daysforyear = days - (year * 365);

    if (minutes < 525600)
      System.out.printf("The Days in %d Minutes is equal %d days", minutes, days);
    else {
      if (days % 365 == 0)
        System.out.printf("The Years of %d Minutes is equal %d Years", minutes, year);
      else
        System.out.printf("The Years of %d Minutes is equal %d Years and %d days", minutes, year, daysforyear);
    }

  }
}