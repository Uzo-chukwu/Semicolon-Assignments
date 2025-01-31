import java.util.Scanner;
public class DiscountCalculationSystem{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.printf("What kind of Customer is this ?%nEnter 1 for premium 2 for Regular: ");
	
	int customer = input.nextInt();
	
	System.out.printf("How much did he/she spend? ");
	int moneySpent = input.nextInt();
	

	int buyAgain = 7;
	
	while(buyAgain != 0){
	if(customer == 1){
		if(moneySpent > 500){
			System.out.println("Congratulations! 10% discount");
			System.out.printf("Do you want to buy again%nYes:1 No:0");
			buyAgain = input.nextInt();
	if(buyAgain == 1){
			System.out.print("Congrats you get an extra 2% discount");
	continue;
		}
		}

	}if(customer == 2){

		if(moneySpent > 300){
			System.out.println("Congratulations! 5% discount");
			System.out.printf("Do you want to buy again%nYes:1 No:0");
			buyAgain = input.nextInt();
		}
		if(buyAgain == 1){
			System.out.print("Congrats you get an extra 2% discount");
	continue;
		}
	}

	
	}





} 




}