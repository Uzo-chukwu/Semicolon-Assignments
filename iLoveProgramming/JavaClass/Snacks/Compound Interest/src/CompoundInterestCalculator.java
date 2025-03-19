import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial investment: $");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter monthly contribution: $");
        double monthlyContribution = scanner.nextDouble();

        System.out.print("Enter length of time in years: ");
        int years = scanner.nextInt();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble() / 100;

        System.out.print("Enter interest rate variance range (%): ");
        double variance = scanner.nextDouble() / 100;

        System.out.print("Enter compound frequency (daily, weekly, monthly, yearly): ");
        String frequency = scanner.next().toLowerCase();
        int compoundFrequency = getCompoundFrequency(frequency);

        if (compoundFrequency == 0) {
            System.out.println("Invalid compound frequency. Exiting.");

            return;
        }

        double lowerBound = calculateCompoundInterest(initialInvestment, annualRate - variance, years, compoundFrequency, monthlyContribution);
        double upperBound = calculateCompoundInterest(initialInvestment, annualRate + variance, years, compoundFrequency, monthlyContribution);
        double average = calculateCompoundInterest(initialInvestment, annualRate, years, compoundFrequency, monthlyContribution);

        System.out.printf("Future value with lower interest rate (%.2f%%): $%.2f\n", (annualRate - variance) * 100, lowerBound);
        System.out.printf("Future value with average interest rate (%.2f%%): $%.2f\n", annualRate * 100, average);
        System.out.printf("Future value with upper interest rate (%.2f%%): $%.2f\n", (annualRate + variance) * 100, upperBound);

        scanner.close();
    }

    private static int getCompoundFrequency(String frequency) {
        switch (frequency) {
            case "daily": return 365;
            case "weekly": return 52;
            case "monthly": return 12;
            case "yearly": return 1;
            default: return 0;
        }
    }

    private static double calculateCompoundInterest(double principal, double rate, int years, int n, double monthlyContribution) {
        double balance = principal;

        for (int year = 0; year < years; year++) {
            for (int period = 0; period < n; period++) {
                if (n == 12 || (n > 12 && period % (n / 12) == 0)) {
                    balance += monthlyContribution;
                }
                balance *= (1 + rate / n);
            }
        }
        return balance;
    }
}