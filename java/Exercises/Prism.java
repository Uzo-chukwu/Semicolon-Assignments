import java.util.Scanner;
public class Prism{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the length of the sides of the triangle");
double lenght= input.nextDouble();


double root3 = Math.sqrt(3);
double area = (root3/4)*(lenght * lenght);
double volume = area * lenght;

System.out.printf("The area is %.2f%nThe volume is %.2f ", area,volume);
}
}