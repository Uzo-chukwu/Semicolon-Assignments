import java.util.Scanner;
public class Interest{
public static void main(String args[]){
Scanner input= new Scanner(System.in);

System.out.print("Enter balance");
int balance = input.nextInt();

System.out.print("Enter the interest rate");
int annualInterest = input.nextInt();

int interest =(annualInterest/1200) * balance ;

System.out.print("The monthly interest is "+ interest);



}
}