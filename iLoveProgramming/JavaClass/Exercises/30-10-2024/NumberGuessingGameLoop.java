import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGameLoop{
	public static void main(String [] args){

	Random rand = new Random();
	Scanner input = new Scanner(System.in);

	System.out.println("Hello welcome to Winning Stake!/n Where you stake 50 naira only, Guess the winning number for a chance to win 1,000,000 naira: ");

	int randomNumber = 0;
	int randomGuess = 1;
	

	while(randomGuess != randomNumber ){

		randomNumber = rand.nextInt(10);


		System.out.println("Guess the winning number: ");
		randomGuess = input.nextInt();

		if(randomGuess == randomNumber){
			System.out.println("Boooom you won! welcome to the millionaires club ");
		}else if(randomGuess > randomNumber){
			System.out.printf("oops %d is higher than the winning number you lost try again",randomGuess);
		}else if(randomGuess < randomNumber){
			System.out.printf("oops %d is lower than the winning number you lost try again",randomGuess);
		}

		

	}

}
}