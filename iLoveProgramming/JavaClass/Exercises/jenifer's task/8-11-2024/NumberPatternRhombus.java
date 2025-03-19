import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();
       

        for (int currentLine = 1; currentLine <= numberOfLines; currentLine++) {
            for (int i = currentLine; i >= 1; i--) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int currentLine = numberOfLines - 1; currentLine >= 1; currentLine--) {
            for (int i = currentLine; i >= 1; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}