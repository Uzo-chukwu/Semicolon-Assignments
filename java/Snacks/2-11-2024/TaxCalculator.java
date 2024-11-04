import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter citizen's name: ");
            String citizenName = scanner.next();

            System.out.print("Enter citizen's earnings: ");
            double earnings = scanner.nextDouble();

            double tax;
            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else {
                tax = (30000 * 0.15) + ((earnings - 30000) * 0.20);
            }

            System.out.println("Citizen: " + citizenName);
            System.out.println("Tax: " + tax);
            System.out.println();
        }

        
    }
}
