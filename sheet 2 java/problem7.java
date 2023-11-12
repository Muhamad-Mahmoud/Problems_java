/*
     * Suppose that the tuition for a university is 10,000 EGP this year and
     * increases 6% every year. In one year, the tuition will be 10,600 EGP. * Write
     * a program that computes the tuition in ten years and the total * *cost of
     * four years’ worth of tuition after the tenth year
     */
import java.util.Scanner;

public class problem7 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Enter The Tuition for Your university  ");
    double tuition = input.nextDouble(); // 10,000

    System.out.println("Enter the annual tuition increase  ");
    double annual_tuition = input.nextDouble() / 100; // 6%

    System.out.println("Enter Count of years ");
    int years = input.nextInt(); // 10

    double total = tuition;

    for (int i = 1; i <= years; i++) {
      tuition += tuition * annual_tuition;
      total += tuition;
    }

    System.out.println("The tuition in " + years + " Years is " + tuition);
    System.out.println("The Total in " + years + " Years is " + total);

  }
}