
import java.util.Scanner;
public class Arithmetic{
public static void main(String [] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter first integer");
int firstNum= input.nextInt();

System.out.print("Enter second integer");
int secondNum= input.nextInt();

int firstSquare = firstNum * firstNum;
int secondSquare = secondNum * secondNum;

int sumOfSquares = firstSquare + secondSquare;
int squareDifference= firstSquare- secondSquare;

System.out.printf("The square of each numberis %d and %d%n The sum of their squares is %d%n The difference in their squares is %d ", firstSquare, secondSquare, sumOfSquares, squareDifference );




}
}