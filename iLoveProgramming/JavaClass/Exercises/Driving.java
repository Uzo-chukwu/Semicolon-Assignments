import java.util.Scanner;
public class Driving{
public static void main (String args[]){
Scanner input = new Scanner(System.in);

System.out.print("Enter the driving distance ");
int DD =input.nextInt();

System.out.print("Enter miles per gallon ");
int MPG = input.nextInt();

System.out.print("Enter price per gallon ");
int PPG = input.nextInt();

int COD= (DD/MPG) * PPG;

System.out.print("The cost of driving is " +COD);







}





}