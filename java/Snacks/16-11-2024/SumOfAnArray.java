import java.util.Scanner;
public class SumOfAnArray{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	int numbers =new int[5];
	int SumOfArray = 0;
	
	System.out.println("Enter 5 numbers");
	for (int count = 0; count < 5; count++){

		numbers[count]= input.nextInt();
	}
		
	for (int count = numbers.length-1 ; count > -1; count--){
	
		SumOfArray += numbers[count] ;		}
		
		
	} 

	System.out.printf("sum = %d",SumOfArray);

}

}