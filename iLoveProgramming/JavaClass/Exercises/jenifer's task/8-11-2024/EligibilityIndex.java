import java.util.Scanner;
public class EligibilityIndex{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter age: ");
	int age = input.nextInt();

	if(age > 16 ){
	System.out.println("Can drive");
	}if(age > 18 ){
	System.out.println("Can vote");
	}if(age > 21 ){
	System.out.println("Can Drink");
	}



}
}