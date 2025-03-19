import java.util.Scanner;
public class Kilo{
public static void main(String args[]){

Scanner input=new Scanner(System.in);

System.out.print("Enter numberin pounds ");
double pounds =input.nextDouble();

double kilo = pounds * 0.454;

System.out.print(pounds +" pounds = "+ kilo+"kilograms");




}
}