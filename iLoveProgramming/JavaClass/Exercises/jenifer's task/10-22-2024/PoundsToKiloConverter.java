import java.util.Scanner;
public class PoundsToKiloConverter{
public static void main(String [] args){
Scanner input= new Scanner(System.in); 

System.out.println("Enter the weight in pounds");
double pounds = input.nextDouble();

double kilo = pounds * 0.454;

system.out.printf("%f pounds = %f kg",pounds,kilo);

