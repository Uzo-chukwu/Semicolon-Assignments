import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSales = 0;

        System.out.print("Enter value of item (0 to quit): ");
        double itemValue = scanner.nextDouble();

        while (itemValue != 0) {
            totalSales += itemValue;

            System.out.print("Enter value of next item (0 to quit): ");
            itemValue = scanner.nextDouble();
        }

        double commission = totalSales * 0.09;
        double earnings = 200 + commission;

        System.out.println("Total sales: $" + totalSales);
        System.out.println("Commission: $" + commission);
        System.out.println("Earnings: $" + earnings);


    }
}