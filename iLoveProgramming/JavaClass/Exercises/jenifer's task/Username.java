import java.util.Scanner;
public class Username{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println ("What is your name");
System.out.printf("What is your %s%n","name");
System.out.print ("What is your name");

String userName = input.nextLine();

System.out.println ("Hi "+userName+" nice to meet you!");
System.out.printf("Hi %s nice to meet you!%n",userName);
System.out.print("Hi "+userName+" nice to meet you!");






}
}