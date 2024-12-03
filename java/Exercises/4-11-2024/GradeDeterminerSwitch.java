import java.util.Scanner;

public class GradeDeterminerSwitch{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);



	System.out.print("Enter the grade: ");
	int grade = input.nextInt();

	switch(grade){
	
	case 50:
		System.out.print("C");
		break;
	case 70:
		System.out.print("B");
		break;
	case 100:
		System.out.print("A");
		break;


}


}

}