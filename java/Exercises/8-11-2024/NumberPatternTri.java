import java.util.Scanner;

public class NumberPatternTri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();
       

        for (int currentLine = 1; currentLine <= numberOfLines; currentLine++) {
            for (int currentNumber = 1; currentNumber <= currentLine; currentNumber++) {
                System.out.print(currentNumber);
            }
            System.out.println();
        }

        for (int currentLine = numberOfLines - 1; currentLine >= 1; currentLine--) {
            for (int currentNumber = 1; currentNumber <= currentLine; currentNumber++) {
                System.out.print(currentNumber);
            }
            System.out.println();
        }
    }
}