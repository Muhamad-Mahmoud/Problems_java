package sheet;

import java.util.Scanner;

public class problem18 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = input.nextInt();

        boolean divisibleBy4And5 = number % 4 == 0 && number % 5 == 0;
        boolean divisibleBy4Or5 = number % 4 == 0 || number % 5 == 0;
        boolean divisibleBy4Or5ButNotBoth = (number % 4 == 0 && number % 5 != 0) || (number % 5 == 0 && number % 4 != 0);

        System.out.printf("%d is divisible by 4 and 5 ? %b\n", number, divisibleBy4And5);
        System.out.printf("%d is divisible by 4 or 5 ? %b\n", number, divisibleBy4Or5);
        System.out.printf("%d is divisible by 4 or 5 but Not both ? %b\n", number, divisibleBy4Or5ButNotBoth);
    }
}