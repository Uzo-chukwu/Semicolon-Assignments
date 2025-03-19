import java.util.Scanner;
public class BmiCalculator{
public static void main(String [] args){
Scanner input= new Scanner(System.in); 

System.out.println("Enter weight in pounds");
double pound = input.nextDouble();

System.out.println("Enter height in inches");
double inch = input.nextDouble();

double kilo = pound * 0.45359237;
double meter = inch * 0.0254;
double bmi = kilo/(meter*meter);

System.out.printf("Your BMI is %.4f",bmi);

}
}