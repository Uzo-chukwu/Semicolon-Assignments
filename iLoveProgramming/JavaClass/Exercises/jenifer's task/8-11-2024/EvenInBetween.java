import java.util.Scanner;
public class EvenInBetween{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.printf("Enter 2 numbers:%nFirst number should be geater than second number%n ");
	int firstNumber = input.nextInt();
	int secondNumber = input.nextInt();
	int sum = 0;
	
	for(int n = secondNumber; n <= firstNumber; n++){
		if(secondNumber>=firstNumber){
			System.out.println("Wrong input format");
			break;
		}if(secondNumber % 2 == 0){
		sum += n;
		
				
		}
	}
	System.out.print(sum);
}
}