import java.util.Scanner;

public class LibraryFineCalculator{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	

int sentinelValue = 1;

    	while(sentinelValue != -1){
		System.out.println("Enter the number of days library member is late to return the book");

		int numberOfDays = input.nextInt();
	
		if(numberOfDays < 6 ){
			System.out.println("50 paise fine.");
		}else if(numberOfDays > 5 && numberOfDays <= 10){
			System.out.println("1 rupee fine.");
		}else if(numberOfDays > 10 && numberOfDays <= 30){
			System.out.println("5 rupee fine.");
		}else if(numberOfDays > 30){
			System.out.println("Membership cancelled");
		}

		System.out.println("Do you want to perform another operation enter 1 to continue or -1 to quit");
		sentinelValue = input.nextInt();
		
	}





	}

}