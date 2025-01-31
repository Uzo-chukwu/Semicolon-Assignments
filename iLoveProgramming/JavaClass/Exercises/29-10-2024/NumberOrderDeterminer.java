import java.util.Scanner;

public class NumberOrderDeterminer{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Enter 3 numbers");
	int firstNum = input.nextInt();
	int secondNum = input.nextInt();
	int thirdNum = input.nextInt();
	
	if(firstNum > secondNum && secondNum > thirdNum){
		System.out.println("Decreasing order");
	}else if(firstNum < secondNum && secondNum < thirdNum){
		System.out.println("Increasing order");
	}else{
		System.out.println("Unorganised");
	}







	}
}