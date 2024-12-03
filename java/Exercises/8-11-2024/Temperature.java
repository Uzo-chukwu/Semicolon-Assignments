import java.util.Scanner;
public class Temperature{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter the temperature in Celcius: ");
	int temperature = input.nextInt();

	if(temperature < 10 ){
	System.out.print("Cold");
	}else if(temperature > 9 && temperature < 26){
	System.out.print("Warm");
	}else{
	System.out.print("Hot");
	}


}
}