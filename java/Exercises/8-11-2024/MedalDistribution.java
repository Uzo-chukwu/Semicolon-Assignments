import java.util.Scanner;
public class MedalDistribution{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter rank: ");
	int rank = input.nextInt();

	switch (rank) {
        	case 1:
			System.out.print("Gold medal");
			break;
        	case 2:
			System.out.print("Silver medal");
			break;
        	case 3:
			System.out.print("Bronze medal");
			break;
        	default:
			System.out.print("Participant ribbon");
			break;
	}
}
}