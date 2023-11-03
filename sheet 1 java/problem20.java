package sheet;

import java.util.Scanner;

public class problem20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = scanner.nextInt();

    System.out.print("Enter month (1-12): ");
    int month = scanner.nextInt();

    System.out.print("Enter day of the month (1-31): ");
    int day = scanner.nextInt();

    int dayOfWeek = calculateDayOfWeek(year, month, day);

    String dayOfWeekName = getDayOfWeekName(dayOfWeek);
    System.out.println("Day of the week: " + dayOfWeekName);

    scanner.close();
  }

  public static int calculateDayOfWeek(int year, int month, int day) {
    if (month < 3) {
      month += 12;
      year--;
    }

    int j = year / 100;
    int k = year % 100;

    int h = (day + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

    return h;
  }

  public static String getDayOfWeekName(int dayOfWeek) {
    switch (dayOfWeek) {
      case 0:
        return "Saturday";
      case 1:
        return "Sunday";
      case 2:
        return "Monday";
      case 3:
        return "Tuesday";
      case 4:
        return "Wednesday";
      case 5:
        return "Thursday";
      case 6:
        return "Friday";
      default:
        return "Invalid day of the week";
    }
  }
}