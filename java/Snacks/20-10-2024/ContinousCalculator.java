   import java.util.Scanner;
public class ContinousCalculator{
public static void main(String []args){
Scanner input= new Scanner(System.in);

int loop = 0;
do{
System.out.println("Enter first number");
double firstNum = input.nextDouble();
System.out.println("Enter second number");
double secondNum = input.nextDouble();
double sum = firstNum+secondNum;
System.out.println(sum);
System.out.printf("Enter %d to perform another addition%nEnter %d to terminate ",1,0); 

loop=input.nextInt();
}while (loop==1);

System.out.println("Thanks for using the app, See you next time");


}
}