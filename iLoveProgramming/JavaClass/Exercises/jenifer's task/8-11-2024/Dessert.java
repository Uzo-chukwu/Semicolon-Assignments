import java.util.Scanner;
public class Dessert{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	System.out.printf("Enter The dessert index:%n1. Ice cream%n2. Sundae%n3. Shake:  ");
	int dessert = input.nextInt();

	switch (dessert) {
        	case 1:
			System.out.printf("What flavour do you want your ice cream :%n1. Chocolate%n2. Vanilla%n3. Strawberry");
			int iceCreamFlavour = input.nextInt();
			switch(iceCreamFlavour){
				case 1: 
					System.out.print("Your chocolate ice cream will be ready in a jiffy enjoy.. ");
					break;
				case 2: 
					System.out.print("Your vanila ice cream will be ready in a jiffy enjoy.. ");
					break;
				case 3: 
					System.out.print("Your Strawberry ice cream will be ready in a jiffy enjoy.. ");
					break;
			}
			break;
        	
			case 2:
			System.out.printf("What flavour do you want your sundae :%n1. Chocolate%n2. Vanilla%n3. Strawberry");
			int sundae = input.nextInt();
			switch(sundae){
				case 1: 
					System.out.print("Your chocolate sundae will be ready in a jiffy enjoy.. ");
					break;
				case 2: 
					System.out.print("Your vanila sundae will be ready in a jiffy enjoy.. ");
					break;
				case 3: 
					System.out.print("Your Strawberry sundae will be ready in a jiffy enjoy.. ");
					break;
			}
			break;

        		case 3:
			System.out.printf("What flavour do you want your shake :%n1. Chocolate%n2. Vanilla%n3. Strawberry");
			int shake = input.nextInt();
			switch(shake){
				case 1: 
					System.out.print("Your chocolate shake will be ready in a jiffy enjoy.. ");
					break;
				case 2: 
					System.out.print("Your vanila shake will be ready in a jiffy enjoy.. ");
					break;
				case 3: 
					System.out.print("Your Strawberry shake will be ready in a jiffy enjoy.. ");
					break;
			}
			break;
	}
}
}