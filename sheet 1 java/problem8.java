package sheet;

import java.util.Scanner;

public class problem8 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    double monthlyInterestRate, annualinterestrate, futureInvestmentValue, investmentAmount, numofyear;

    System.out.println("Enter investment Amount");
    investmentAmount = input.nextInt();
    System.out.println("Enter annual interest rate");
    annualinterestrate = input.nextDouble();
    System.out.println("Enter Number Of Year");
    numofyear = input.nextInt();

    monthlyInterestRate = (annualinterestrate / 12) / 100;
    futureInvestmentValue = investmentAmount * (double) Math.pow((1 + monthlyInterestRate), numofyear * 12);
    System.out.println("Future Investment Value is equal: " + futureInvestmentValue);
  }
}