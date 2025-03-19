import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int largest = Integer.MIN_VALUE;

        while (counter < 10) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("Largest number: " + largest);

        
    }
}
