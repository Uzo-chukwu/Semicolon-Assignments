import java.util.Scanner;

public class NaturalNumbersReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int upperLimit = input.nextInt();
      

        for (int currentNumber = upperLimit; currentNumber >= 1; currentNumber--) {
            System.out.println(currentNumber);
        }
    }
}