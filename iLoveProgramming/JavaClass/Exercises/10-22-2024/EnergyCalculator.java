import java.util.Scanner;
public class EnergyCalculator{
public static void main(String [] args){
Scanner input= new Scanner(System.in);

 
System.out.println("enter the amount of water in kg ");
double weight= input.nextDouble();

System.out.println("enter the initial temperature ");
double initial= input.nextDouble();

System.out.println("enter the final temperature ");
double final= input.nextDouble();

double energy =  weight * (final - initial) * 4184;


System.out.printf("The energy needed= %f " energy);






}
}