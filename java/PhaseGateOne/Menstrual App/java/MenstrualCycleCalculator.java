import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenstrualCycleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Menstrual Cycle Calculator!");

        LocalDate lastPeriodStartDate = getLastPeriodStartDate(scanner);
        int averageCycleLength = getAverageCycleLength(scanner);
        int averagePeriodDuration = getAveragePeriodDuration(scanner);

        LocalDate nextPeriodStartDate = calculateNextPeriodStartDate(lastPeriodStartDate, averageCycleLength);
        LocalDate estimatedOvulationDate = calculateEstimatedOvulationDate(lastPeriodStartDate, averageCycleLength);
        LocalDate fertileStartDate = estimatedOvulationDate.minusDays(5);
        LocalDate fertileEndDate = estimatedOvulationDate.plusDays(1);
        LocalDate safePeriodStart = lastPeriodStartDate.plusDays(averagePeriodDuration);
        LocalDate safePeriodEnd = fertileStartDate.minusDays(1);
        LocalDate safePeriodStartAfterFertile = fertileEndDate.plusDays(1);
        LocalDate safePeriodEndAfterFertile = nextPeriodStartDate.minusDays(1);

        System.out.println("\nCalculations:");
        System.out.println("Next Period Start Date: " + nextPeriodStartDate);
        System.out.println("Estimated Ovulation Date: " + estimatedOvulationDate);
        System.out.println("Fertile Period: " + fertileStartDate + " to " + fertileEndDate);
        System.out.println("Safe Period (Before Fertile Window): " + safePeriodStart + " to " + safePeriodEnd);
        System.out.println("Safe Period (After Fertile Window): " + safePeriodStartAfterFertile + " to " + safePeriodEndAfterFertile);
	
        
    }

    private static LocalDate getLastPeriodStartDate(Scanner scanner) {
        boolean isValid = false;
        LocalDate lastPeriodStartDate = null;

        while (!isValid) {
            try {
                System.out.print("Enter the start date of your last period (YYYY-MM-DD): ");
                String date = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                lastPeriodStartDate = LocalDate.parse(date, formatter);
                if (lastPeriodStartDate.isAfter(LocalDate.now())) {
                    System.out.println("Date cannot be in the future. Please try again.");
                } else {
                    isValid = true;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            }
        }
        return lastPeriodStartDate;
    }

    private static int getAverageCycleLength(Scanner scanner) {
        boolean isValid = false;
        int averageCycleLength = 0;

        while (!isValid) {
            try {
                System.out.print("Enter your average cycle length (in days): ");
                averageCycleLength = scanner.nextInt();
                scanner.nextLine();
                if (averageCycleLength < 15 || averageCycleLength > 45) {
                    System.out.println("Average cycle length must be between 15 and 45 days. Please try again.");
                } else {
                    isValid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine();
            }
        }
        return averageCycleLength;
    }

    private static int getAveragePeriodDuration(Scanner scanner) {
        boolean isValid = false;
        int averagePeriodDuration = 0;

        while (!isValid) {
            try {
                System.out.print("Enter your average period duration (in days): ");
                averagePeriodDuration = scanner.nextInt();
                scanner.nextLine();
                if (averagePeriodDuration < 3 || averagePeriodDuration > 10) {
                    System.out.println("Average period duration must be between 3 and 10 days. Please try again.");
                } else {
                    isValid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine();
            }
        }
        return averagePeriodDuration;
    }

    private static LocalDate calculateNextPeriodStartDate(LocalDate lastPeriodStartDate, int averageCycleLength) {
        return lastPeriodStartDate.plusDays(averageCycleLength);
    }

    private static LocalDate calculateEstimatedOvulationDate(LocalDate lastPeriodStartDate, int averageCycleLength) {
        return lastPeriodStartDate.plusDays(averageCycleLength - 14);
    }
}