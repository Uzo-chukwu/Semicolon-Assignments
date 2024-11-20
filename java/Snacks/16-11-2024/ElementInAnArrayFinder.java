import java.util.Scanner;
public class ElementInAnArrayFinder{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	int[] numbers ={1,2,3,4,5,6,7,8,9};
	
	System.out.print("Enter a number");
	int number = input.nextInt();

	for (int count = numbers.length - 1; count > -1; count--){
	
		if(number == numbers[count]){
			System.out.print("True");
		}else{
			System.out.print("False");

		}
	} 



}

}