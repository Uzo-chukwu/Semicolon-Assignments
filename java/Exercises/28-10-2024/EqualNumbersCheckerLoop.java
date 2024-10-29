import java.util.Scanner;

public class EqualNumbersCheckerLoop{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
int quit = 1;


while(quit != 0){

System.out.println(" Enter 3 numbers: ");

int firstNumber = input.nextInt();
int secondNumber = input.nextInt();
int thirdNumber = input.nextInt();

if(firstNumber == secondNumber && firstNumber == thirdNumber){
	System.out.println("They are  equal");
}else {
	System.out.println("They are not equal ");
}
System.out.print("Do you want to continue? enter 1 to continue 0 to quit");
quit = input.nextInt();

}
System.out.print("Goodbye");

}

}