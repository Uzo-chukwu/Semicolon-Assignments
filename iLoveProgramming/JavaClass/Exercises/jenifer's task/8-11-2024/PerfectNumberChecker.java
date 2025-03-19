import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int inputNumber = input.nextInt();
      

        if (inputNumber <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sumOfDivisors = 0;
            for (int potentialDivisor = 1; potentialDivisor < inputNumber; potentialDivisor++) {
                if (inputNumber % potentialDivisor == 0) {
                    sumOfDivisors += potentialDivisor;
                }
            }
            if (sumOfDivisors == inputNumber) {
                System.out.println(inputNumber + " is a perfect number.");
            } else {
                System.out.println(inputNumber + " is not a perfect number.");
            }
        }
    }
}
