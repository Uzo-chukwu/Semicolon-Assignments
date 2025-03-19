import java.util.Scanner;
public class RangeDivision{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a range: ");
	int firstNumber = input.nextInt();
	int secondNumber = input.nextInt();
	
	
	for(int n = secondNumber; n <= firstNumber; n++){
		if(n % 7 == 0 && n % 13 == 0){
			System.out.println(n);
				break;
		}else{
			System.out.println("none divisible");
				break;
		}
	}
	
}
}