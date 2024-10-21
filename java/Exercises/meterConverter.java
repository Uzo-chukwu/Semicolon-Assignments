// Import the Scanner class to take user input
import java.util.Scanner;

public class Converter {

    // The main method where the program starts executing
    public static void main(String[] args) {

        /* 
         * Create a Scanner object to capture input from the user
         * 
         */
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number in feet
        System.out.print("Enter number in feet: ");
        float feet = input.nextFloat(); // Read the feet input as a float value

        // Convert the feet to meters using the conversion factor 1 foot = 0.305 meters
         float meters = feet*0.305;
        // Display the result
         System.out.print(feet +"feet is = " +meters+" meters" );

