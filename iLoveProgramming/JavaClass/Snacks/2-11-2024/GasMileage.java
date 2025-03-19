import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        int miles = scanner.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallons = scanner.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.println("Miles per gallon for this trip: " + milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            double combinedMilesPerGallon = (double) totalMiles / totalGallons;
            System.out.println("Combined miles per gallon: " + combinedMilesPerGallon);

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = scanner.nextInt();
        }


    }
}