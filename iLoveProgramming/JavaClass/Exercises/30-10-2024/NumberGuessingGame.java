import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
	public static void main(String [] args){

	Random rand = new Random();
	Scanner input = new Scanner(System.in);

	int randomNumber = rand.nextInt(100);


	System.out.print("Stake 50 naira, Guess the winning number between 0 - 100 for a chance to win 1000 naira");
	int randomGuess = input.nextInt();

	if(randomGuess == randomNumber){
		System.out.println("Boooom you won you are 1000 naira richer ");
	}else if(randomGuess > randomNumber){
		System.out.println("oops number is higher than the winning number you lost try again");
	}else if(randomGuess < randomNumber){
		System.out.println("oops number is lower than the winning number you lost try again");

	}

}
}