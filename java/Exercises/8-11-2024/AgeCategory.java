import java.util.Scanner;
public class AgeCategory{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter age: ");
	int age = input.nextInt();

	if(age < 13 ){
	System.out.print("Child");
	}else if(age > 12 && age < 18){
	System.out.print("Teen");
	}else if(age > 17 && age < 65){
	System.out.print("Adult");
	}else{
	System.out.print("Senior");
	}


}
}