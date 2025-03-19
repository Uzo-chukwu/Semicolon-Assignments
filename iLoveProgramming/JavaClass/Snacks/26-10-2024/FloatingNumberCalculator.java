import java.util.Scanner;

public class FloatingNumberCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter first decimal number");
double firstNumber = input.nextDouble();
System.out.println("Enter second decimal number");
double secondNumber = input.nextDouble();

double firstFloat = firstNumber % 1;
double secondFloat = secondNumber % 1;

double roundedFirst = Math.round(firstFloat * 1000) / 1000.0;
double roundedSecond = Math.round(secondFloat * 1000) / 1000.0;

if (roundedFirst == roundedSecond) {
System.out.println("They are the same!");
} else {
System.out.println("They are not the same!");
}


}
}