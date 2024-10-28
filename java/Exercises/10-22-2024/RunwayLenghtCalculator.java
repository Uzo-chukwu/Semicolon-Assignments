import java.util.Scanner;
public class RunwayLenghtCalculator{
public static void main(String [] args){
Scanner input= new Scanner(System.in); 

System.out.println("Enter the the speed of the aircraft ");
double speed = input.nextDouble();

System.out.println("Enter the the acceleration ");
double acceleration = input.nextDouble();


double lenght = (speed * speed)/(2*acceleration);

System.out.printf("The lenght of the runway is %f", lenght);


}
}