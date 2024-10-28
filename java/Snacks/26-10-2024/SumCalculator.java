import java.util.Scanner;
public class SumCalculator{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

int iteration =0;

do{
System.out.println("Enter 2 numbers.");
int firstNumber = input.nextInt();
int secondNumber = input.nextInt();

int sum = firstNumber + secondNumber;
System.out.printf("%d + %d = %d%n",firstNumber,secondNumber,sum);

System.out.print("Do you want to perform another addition? enter 1 to continue or 0 to quit: ");
iteration = input.nextInt();

}while(iteration != 0);




}
}
