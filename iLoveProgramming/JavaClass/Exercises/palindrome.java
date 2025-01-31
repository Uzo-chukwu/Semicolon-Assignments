
import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = input.nextInt();                int firstInt = number / 100;         
        int lastInt = number % 10; 
        int pal = firstInt - lastInt; 

        
        if (pal == 0) {
        System.out.println(number + " is a palindrome because pal = " + pal);
        } else {
        System.out.println(number + " is not a palindrome");
        }

       