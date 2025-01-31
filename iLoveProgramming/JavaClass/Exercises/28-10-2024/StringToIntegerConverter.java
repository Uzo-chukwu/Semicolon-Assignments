import java.util.Scanner;

public class StringToIntegerConverter{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Input a number string: ");
String numberString = input.nextLine();

int number = Integer.valueOf(numberString);

System.out.print(number);


}
}