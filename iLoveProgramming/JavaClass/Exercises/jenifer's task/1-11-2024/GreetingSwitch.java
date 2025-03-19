import java.util.Scanner;

public class GreetingSwitch{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
	
		System.out.printf("Can i greet?%nPlease select an option 1 for yes 2 for no: ");
		

		int greet = input.nextInt();
		
		switch(greet){

		case 1: 
			System.out.printf("Okay great what language should i greet you in%n1.Yoruba%n2.Hausa%n3.Igbo: ");
			int language =input.nextInt();
			switch(language){
				
			case 1:
				System.out.printf("1.Morning%n2.Afternoon%n3.Evening: ");
				int timeOfDay = input.nextInt();

				switch(timeOfDay){
			case 1:
				System.out.println("Ekaaro");
				break;
			case 2:
				System.out.println("Ekaasan");
				break;
			case 3:
				System.out.println("Ekaale");
				break;

}

			case 2:
				System.out.printf("1.Morning%n2.Afternoon%n3.Evening: ");
				timeOfDay = input.nextInt();

				switch(timeOfDay){
			case 1:
				System.out.println("Inakwana");
				break;
			case 2:
				System.out.println("Sanu afternoon");
				break;
			case 3:
				System.out.println("Sanu evening");
				break;

}

			case 3: 
				System.out.printf("1.Morning%n2.Afternoon%n3.Evening: ");
				timeOfDay = input.nextInt();

				switch(timeOfDay){
			case 1:
				System.out.println("Ututu oma");
				break;
			case 2:
				System.out.println("Ehihie oma");
				break;
			case 3:
				System.out.println("Kachi fo");
				break;

}
				

}
			break;
		case 2:
			System.out.println("Okay bye");
			break;
}
}
}
