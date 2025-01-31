import java.util.Scanner;
public class DecimalToBinaryConverter{
public static void main(String [] args){
Scanner input= new Scanner(System.in); 

System.out.println("Enter the the decimal number ");
int decimal = input.nextInt();

int binary = IntegerToBinary(decimal);

System.out.printf("%d to binary = %d",decimal,binary );

}
}