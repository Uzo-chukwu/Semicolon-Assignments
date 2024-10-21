// Import the Scanner class 
import java.util.Scanner;

public class SumOfDigits {

    // This is the main method, where the program begins its execution
    public static void main(String[] args) {

        /* 
         * Create a new Scanner object to get input from the user
         * 
         */
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number between 0 and 1000
        System.out.print("Enter a number between 0 to 1000: ");
        int number = input.nextInt(); // Read the input number

        // Extract the first digit 
        int firstNum = number / 100; // Integer division to get the first digit
        
        // Extract the second digit 
        int secondNum = (number % 100) / 10; // Modulo 100 to remove hundreds, then divide by 10 to get the tens digit
        
        // Extract the third digit 
        int thirdNum = number % 10; // Modulo 10 to get the last digit

        // Calculate the sum of the digits
        int sum = firstNum + secondNum + thirdNum; // Sum the three digits

        // Print the sum of the digits
        System.out.printf("The sum of the 3 digits is: %d", sum);

        
    }
}