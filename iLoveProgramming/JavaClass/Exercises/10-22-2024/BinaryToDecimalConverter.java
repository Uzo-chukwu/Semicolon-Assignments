import java.util.Scanner;
public class BinaryToDecimalConverter{
public static void main(String [] args){
Scanner input= new Scanner(System.in); 

System.out.println("Enter the the binary number ");
int binary = input.nextInt();

int decimal = BinaryToDecimal(binary);

System.out.printf("%d to decimal = %d",binary,decimal );

}
}