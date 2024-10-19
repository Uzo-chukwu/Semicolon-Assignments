
import java.util.Scanner;

public class SumOfDigits {

        public static void main(String[] args) {

               Scanner input = new Scanner(System.in);

                System.out.print("Enter a number between 0 to 1000: ");
        int number = input.nextInt(); 

               int firstNum = number / 100;         
         
        int secondNum = (number % 100) / 10;         
         
        int thirdNum = number % 10;
        
        int sum = firstNum + secondNum + thirdNum; 
        
        System.out.printf("The sum of the 3 digits is: %d", sum);

        
    }
}