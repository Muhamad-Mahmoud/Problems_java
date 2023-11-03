package sheet;

import java.util.Scanner;

public class problem11 {
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

    // Check Interpretation
    if (bmi < 18.5) {
      System.out.println("Interpretation Of BMI Is : Underweight");
    } else if (bmi < 25.0) {
      System.out.println("Interpretation Of BMI Is : Normal");
    } else if (bmi < 30.0) {
      System.out.println("Interpretation Of BMI Is : Overweight");
    } else {
      System.out.println("Interpretation Of BMI Is : Obese");
    }
  }
}