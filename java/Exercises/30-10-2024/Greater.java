import java.util.Scanner;

public class Greater {

	public static void main(String [] args){
	
	Scanner input= new Scanner(System.in);

	System.out.println("Enter 2 numbers: ");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
        int sum = num1 + num2;

	System.out.print((sum > 50)? "Even is greater": " ");


}

}