// Import the Scanner class to take user input
import java.util.Scanner;

public class palindrome {

    // The main method where the program starts executing
    public static void main(String[] args) {

        /* 
         * Create a Scanner object to read input from the user.
         *
         */
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Extract the first digit by dividing the number by 100
        int firstInt = number / 100; // This will give the first digit
        
        // Extract the last digit using modulo 10
        int lastInt = number % 10; // This will give the last digit

        // Check if the first digit and the last digit are the same
        int pal = firstInt - lastInt; // Subtract last digit from first digit to check if they match

        // If the result is 0, it's a palindrome
        if (pal == 0) {
            // The number is a palindrome
            System.out.println(number + " is a palindrome because pal = " + pal);
        } else {
            // The number is not a palindrome
            System.out.println(number + " is not a palindrome");
        }

       