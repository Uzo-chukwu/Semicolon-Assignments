import java.util.Scanner;
public class A{
public static void main(String args[]){

Scanner input=new Scanner(System.in);

System.out.print("Enter starting velocity");
double V0 =input.nextDouble();

System.out.print("Enter ending velocity  ");
double V1 =input.nextDouble();

System.out.print("Enter time span ");
double t =input.nextDouble();


double a = (V1 - V0) / t;

System.out.print("Acceleration = "+ a);




}
}