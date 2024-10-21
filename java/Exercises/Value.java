// Import the Scanner class import java.util.Scanner;

public class Value {

    // Main method where the program starts execution
    public static void main(String [] args) {

        /* 
         * Create a new Scanner object to read input from the user
         * This is where the Scanner class comes to life.
         */
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 5 integers
        System.out.println("Enter 5 integers");

        // collect 5 integers from the user 
        int num1 = input.nextInt(); // First number
        int num2 = input.nextInt(); // Second number
        int num3 = input.nextInt(); // Third number
        int num4 = input.nextInt(); // Fourth number
        int num5 = input.nextInt(); // Fifth number

        // Initialize counters for positive, negative, and zero numbers
        int positive = 0; // To count positive numbers
        int negative = 0; // To count negative numbers
        int zero = 0;     // To count zeros

      

        // Check if num1 is positive, negative, or zero and update the counters
        if (num1 > 0) {
            positive++;
        } else if (num1 < 0) {
            negative++;
        } else {
            zero++;
        }

        // Check if num2 is positive, negative, or zero and update the counters
        if (num2 > 0) {
            positive++;
        } else if (num2 < 0) {
            negative++;
        } else {
            zero++;
        }

        // Check if num3 is positive, negative, or zero and update the counters
        if (num3 > 0) {
            positive++;
        } else if (num3 < 0) {
            negative++;
        } else {
            zero++;
        }

        // Check if num4 is positive, negative, or zero and update the counters
        if (num4 > 0) {
            positive++;
        } else if (num4 < 0) {
            negative++;
        } else {
            zero++;
        }

        // Check if num5 is positive, negative, or zero and update the counters
        if (num5 > 0) {
            positive++;
        } else if (num5 < 0) {
            negative++;
        } else {
            zero++;
        }

        // Print the results showing the counts of positive, negative, and zero numbers
        System.out.printf("There are %d positive numbers%nThere are %d negative numbers%nThere are %d zero numbers", positive, negative, zero);

       
    }
}