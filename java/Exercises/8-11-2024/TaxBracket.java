import java.util.Scanner;
public class TaxBracket{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	System.out.print("annual income: ");
	int income = input.nextInt();

	if(income < 9876 ){
	System.out.print("10%");
	}else if(income > 9875 && income < 40126){
	System.out.print("12%");
	}else if(income > 40125 && income < 85526){
	System.out.print("22%");
	}else{
	System.out.print("24%");
	}


}
}