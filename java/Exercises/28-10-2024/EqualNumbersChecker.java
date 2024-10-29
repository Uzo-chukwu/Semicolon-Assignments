import java.util.Scanner;

public class EqualNumbersChecker{
public static void main(String [] args){

Scanner input = new Scanner(System.in);


System.out.println(" enter 3 numbers: ");
int firstNumber = input.nextInt();
int secondNumber = input.nextInt();
int thirdNumber = input.nextInt();

if(firstNumber == secondNumber && firstNumber == thirdNumber && secondNumber == thirdNumber){
	System.out.print("They are  equal");
}else {
	System.out.print("They are not equal ");

}


}

}