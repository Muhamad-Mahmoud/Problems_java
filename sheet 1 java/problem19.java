package sheet;
import java.util.Scanner;

public class problem19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your filing status: ");
        System.out.println("0 - Single filer");
        System.out.println("1 - Married filing jointly");
        System.out.println("2 - Married filing separately");
        System.out.println("3 - Head of household");
        int filingStatus = scanner.nextInt();

        System.out.println("Enter your taxable income: ");
        double taxableIncome = scanner.nextDouble();

        double taxAmount = calculateTax(filingStatus, taxableIncome);
        System.out.println("Your tax amount is: $" + taxAmount);

        scanner.close();
    }

    public static double calculateTax(int filingStatus, double taxableIncome) {
        double[] taxRates = {0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};
        double[][] taxBrackets = {
                {0, 9875, 40125, 85525, 163300, 207350, 518400},     // Single filer
                {0, 19750, 80250, 171050, 326600, 414700, 622050},   // Married filing jointly
                {0, 9875, 40125, 85525, 163300, 207350, 311025},     // Married filing separately
                {0, 14100, 53700, 85500, 163300, 207350, 518400}     // Head of household
        };

        double taxAmount = 0;

        for (int i = taxBrackets[0].length - 1; i >= 0; i--) {
            if (taxableIncome > taxBrackets[filingStatus][i]) {
                taxAmount += (taxableIncome - taxBrackets[filingStatus][i]) * taxRates[i + 1];
                taxableIncome = taxBrackets[filingStatus][i];
            }
        }

        taxAmount += taxableIncome * taxRates[0];

        return taxAmount;
    }
}