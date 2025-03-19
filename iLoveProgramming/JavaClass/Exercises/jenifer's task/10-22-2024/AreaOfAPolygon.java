import java.util.Scanner;
public class AreaOfAPolygon{
public static void main(String [] args){
Scanner input= new Scanner(System.in); 

System.out.println("Enter the number of sides: ");
double numberOfSides= input.nextDouble();
System.out.println("Enter the lenght of one side: ");
double numberOfSide= input.nextDouble();

double pi=22/7;


double area= (numberOfSide*(lenght*lenght))/(4*(Math.Tan(pi/numberOfSide)));



System.out.printf("The area of the polygon is%f",area);


}
}