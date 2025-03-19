import java.util.Scanner;
public class Calculators{
public static void main(String [] args){
Scanner input= new Scanner(System.in);

System.out.println("Enter the first number");
int first = input.nextInt();

System.out.println("Enter the second number");
double second = input.nextDouble();

System.out.println("Enter the first number");
float third = input.nextFloat();

double sum = first + second + third;

System.out.print("The sum of %f, %f, and %f = %f ", integer, double, float, sum);
}
}