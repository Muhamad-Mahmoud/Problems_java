/*
 *  Write a program that prompts the user to enter the number of students and each student’s 
  name and score, and finally displays the names of the students with the highest and lowest 
  scores. Use the next() method in the Scanner class to read a name.
 */
import java.util.Scanner;

public class problem9 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("enter the number of students");
    int numStudent = input.nextInt();

    String[] names = new String[numStudent];
    int[] scores = new int[numStudent];

    System.out.print("Enter Student Name: ");
    names[0] = input.next();
    System.out.print("Enter Student Score: ");
    scores[0] = input.nextInt();

    int maxscore = scores[0];
    int minscore = scores[0];
    String Maxname = names[0];
    String Minname = names[0];

    for (int i = 1; i < numStudent; i++) {
      System.out.print("Enter Student Name: ");
      names[i] = input.next();
      System.out.print("Enter Student Score: ");
      scores[i] = input.nextInt();

      if (scores[i] > maxscore) {
        maxscore = scores[i];
        Maxname = names[i];
      }

      if (scores[i] < minscore) {
        minscore = scores[i];
        Minname = names[i];
      }
    }

    System.out.println("Max Score: " + Maxname + ", His Score is: " + maxscore);
    System.out.println("Min Score: " + Minname + ", His Score is: " + minscore);
  }
}