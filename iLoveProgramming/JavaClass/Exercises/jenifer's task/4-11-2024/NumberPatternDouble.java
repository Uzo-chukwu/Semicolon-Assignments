import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scannerinput = new Scanner(System.in);
        
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();


        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        for (int i = lines - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}