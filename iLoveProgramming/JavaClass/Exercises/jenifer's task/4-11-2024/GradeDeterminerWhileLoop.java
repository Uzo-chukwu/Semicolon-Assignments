import java.util.Scanner;

public class GradeDeterminerWhileLoop{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int counter = 0;
	
	while(counter < 5){

	System.out.print("Enter the grade: ");
	int grade = input.nextInt();

	if(grade < 50)
		System.out.println("D");
	if(grade >= 50 && grade <= 60)
		System.out.println("C");
	if(grade >= 60 && grade <= 80)
		System.out.println("B");
	if(grade >= 80 && grade <= 100)
		System.out.println("A");
	counter++;
}


}

}