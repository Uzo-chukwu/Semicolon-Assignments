import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckoutApp {

    private static ArrayList<String[]> cart = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean active = true;

        while (active) {
            System.out.println("1. Add product to cart");
            System.out.println("2. Checkout");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); 

                    String[] product = {name, String.valueOf(price), String.valueOf(quantity)};
                    cart.add(product);
                    break;
                case "2":
                    System.out.print("Enter cashier's name: ");
                    String cashierName = scanner.nextLine();
                    System.out.print("Enter customer's name: ");
                    String customerName = scanner.nextLine();

                    double total = calculateTotal();
                    double discountRate = 0.1;
                    double discount = calculateDiscount(total, discountRate);
                    double vat = calculateVat(total, discount);
                    double grandTotal = (total - discount) + vat;

                    displayInvoice(total, discount, vat, grandTotal, cashierName, customerName);
                    processPayment(grandTotal, scanner);

                    cart.clear();
                    break;
                case "3":
                    active = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static double calculateTotal() {
        double total = 0;
        for (String[] product : cart) {
            total += Double.parseDouble(product[1]) * Integer.parseInt(product[2]);
        }
        return total;
    }

    private static double calculateDiscount(double total, double discountRate) {
        if (total >= 100) {
            return total * discountRate;
        } else {
            return 0;
        }
    }

    private static double calculateVat(double total, double discount) {
        return (total - discount) * 0.175;
    }

    private static void displayInvoice(double total, double discount, double vat, double grandTotal, String cashierName, String customerName) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
        String dateTime = formatter.format(new Date());

        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293928343");
        System.out.println("Date: " + dateTime);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("\nITEM         QTY   PRICE   TOTAL(NGN)");
        System.out.println("--------------------------------------");

        for (String[] product : cart) {
            double subtotal = Double.parseDouble(product[1]) * Integer.parseInt(product[2]);
            System.out.printf("%-12s %4s %7.2f %10.2f\n", product[0], product[2], Double.parseDouble(product[1]), subtotal);
        }

        System.out.println("--------------------------------------");
        System.out.printf("Sub Total: %29.2f\n", total);
        System.out.printf("Discount: %30.2f\n", discount);
        System.out.printf("VAT @ 17.5%%: %26.2f\n", vat);
        System.out.printf("Bill Total: %27.2f\n", grandTotal);
        System.out.println("--------------------------------------");
        System.out.println("THIS IS NOT A RECEIPT. KINDLY PAY " + String.format("%.2f", grandTotal));
    }

    private static void processPayment(double grandTotal, Scanner scanner) {
        System.out.print("\nHow much did the customer give to you? ");
        double payment = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        if (payment >= grandTotal) {
            double balance = payment - grandTotal;
            System.out.printf("Amount Paid: %28.2f\n", payment);
            System.out.printf("Balance: %31.2f\n", balance);
            System.out.println("\nTHANK YOU FOR YOUR PATRONAGE");
        } else {
            System.out.println("Insufficient payment. Please complete payment.");
        }
    }
}