import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose operation (E/D): ");
        String operation = scanner.next();

        System.out.print("Enter a four-digit integer: ");
        int num = scanner.nextInt();

        int digit1, digit2, digit3, digit4;

        if (operation.equalsIgnoreCase("E")) {
            digit1 = (num / 1000 + 7) % 10;
            digit2 = (num / 100 % 10 + 7) % 10;
            digit3 = (num / 10 % 10 + 7) % 10;
            digit4 = (num % 10 + 7) % 10;

            int encrypted = digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
            System.out.println("Encrypted integer: " + encrypted);
        } else if (operation.equalsIgnoreCase("D")) {
            digit1 = num / 1000;
            digit2 = num / 100 % 10;
            digit3 = num / 10 % 10;
            digit4 = num % 10;

            int decrypted = ((digit3 - 7 + 10) % 10) * 1000 + ((digit4 - 7 + 10) % 10) * 100 + ((digit1 - 7 + 10) % 10) * 10 + ((digit2 - 7 + 10) % 10);
            System.out.println("Decrypted integer: " + decrypted);
        }

       
    }
}