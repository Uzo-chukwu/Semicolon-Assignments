import java.util.Scanner;

public class cl{
	public static void main(String [] args){
	Scanner input= new Scanner(System.in);

	System.out.println(" Enter investment amount: ");
	double investmentAmount = input.nextDouble();
	
	System.out.println("Enter annual interest rate in percentage");
	double annualRate = input.nextDouble();
	
	System.out.println(" Enter number of years: ");
	double years = input.nextDouble();

	double monthlyRate= annualRate/100/12;

	double accumulatedValue= investmentAmount*(Math.pow((1+monthlyRate), (years*12)));
	
	System.out.printf("The accumulated value is %.2f" ,accumulatedValue);

	



}
}