import java.util.Scanner;
public class CollegeLevel{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	System.out.printf("Enter your case:%n1. Math%n2. Science%n3. History:  ");
	int course = input.nextInt();

	switch (course) {
        	case 1:
			System.out.printf("What level are you in :%n1. Freshman%n2. Sophomore%n3. Junior%n4. Senior");
			int math = input.nextInt();
			switch(math){
				case 1: 
					System.out.print("Freshman Math instructor");
					break;
				case 2: 
					System.out.print("Sophomore Math instructor ");
					break;
				case 3: 
					System.out.print("Junior Math instructor ");
					break;
				case 4: 
					System.out.print("Senior Math instructor ");
					break;


			}
			break;
        	
		case 2:
			System.out.printf("What level are you in :%n1. Freshman%n2. Sophomore%n3. Junior%n4. Senior");
			int science = input.nextInt();
			switch(science){
				case 1: 
					System.out.print("Freshman Science instructor");
					break;
				case 2: 
					System.out.print("Sophomore Science instructor ");
					break;
				case 3: 
					System.out.print("Junior Science instructor ");
					break;
				case 4: 
					System.out.print("Senior Science instructor ");
					break;


			}
			break;


        	case 3:
			System.out.printf("What level are you in :%n1. Freshman%n2. Sophomore%n3. Junior%n4. Senior");
			int history = input.nextInt();
			switch(history){
				case 1: 
					System.out.print("Freshman History instructor");
					break;
				case 2: 
					System.out.print("Sophomore History instructor ");
					break;
				case 3: 
					System.out.print("Junior History instructor ");
					break;
				case 4: 
					System.out.print("Senior History instructor ");
					break;


			}
			break;

	}
}
}