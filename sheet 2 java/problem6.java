import java.util.Scanner;

public class problem6 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    /*
     * Write a program that prompts a student to enter a Java score.
     * If the score is greater or equal to 60,
     * display “you pass the exam”; otherwise,
     * display “you don’t pass the exam”. Your program ends with input -1
     */

    System.out.println("Enter Java score Or (-1) to exite");
    int score = input.nextInt();
    if (score == -1)
      return;
    else if (score >= 60)
      System.out.println("you pass the exam");
    else
      System.out.println("you don’t pass the exam");
  }
}