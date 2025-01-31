import java.util.Scanner;
public class Choice{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	
	System.out.printf("What do you want to do :%n1. Add%n2. View%n3. Delete%n4. Quit:  ");
	int choice = input.nextInt();


	while(choice!=4){
		if(choice == 1){
			System.out.print("Add");
		}else if(choice == 2){
			System.out.print("View");
		}else if(choice == 3){
			System.out.print("Delete");
		}else{
			System.out.println("Wrong input ");
		}


		System.out.printf("What do you want to do :%n1. Add%n2. View%n3. Delete%n4. Quit:  ");
	choice = input.nextInt();








	}
}
}