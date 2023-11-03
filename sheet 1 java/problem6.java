package sheet;

import java.util.Scanner;

public class problem6 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    double weightPound, heightInch, weightKg, heightMeters, bmi;

    System.out.println("Enter your weight in pounds:");
    weightPound = input.nextDouble();

    System.out.println("Enter your height in inches:");
    heightInch = input.nextDouble();

    weightKg = weightPound * 0.45359237;
    heightMeters = heightInch * 0.0254;

    bmi = weightKg / Math.pow(heightMeters, 2);
    System.out.println("Your Body Mass Index (BMI): " + bmi);

  }
}