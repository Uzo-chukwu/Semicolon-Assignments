import java.util.Scanner;
public class Department{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	System.out.printf("Enter department index:%n1. IT%n2. HR%n3. Finance:  ");
	int department = input.nextInt();

	switch (department) {
        	case 1:
			System.out.printf("Whats your role in the IT department:%n1. Manager%n2. Analyst%n3. Intern");
			int itRole = input.nextInt();
			switch(itRole){
				case 1: 
					System.out.print("Hello IT manager ");
					break;
				case 2: 
					System.out.print("Hello IT Analyst ");
					break;
				case 3: 
					System.out.print("Hello IT Intern ");
					break;
			}
			break;
        	
		case 2:
			System.out.printf("Whats your role in the HR department:%n1. Manager%n2. Analyst%n3. Intern");
			int hrRole = input.nextInt();
			switch(hrRole){
				case 1: 
					System.out.print("Hello HR manager ");
					break;
				case 2: 
					System.out.print("Hello HR Analyst ");
					break;
				case 3: 
					System.out.print("Hello HR Intern ");
					break;
			}
			break;

        	case 3:
			System.out.printf("Whats your role in the Finance department:%n1. Manager%n2. Analyst%n3. Intern");
			int financeRole = input.nextInt();
			switch(financeRole){
				case 1: 
					System.out.print("Hello Finance manager ");
					break;
				case 2: 
					System.out.print("Hello Finance Analyst ");
					break;
				case 3: 
					System.out.print("Hello Finance Intern ");
					break;
			}
			break;
	}
}
}