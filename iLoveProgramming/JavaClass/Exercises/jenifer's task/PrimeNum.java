import java.util.Scanner;
public class PrimeNum{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number");
int number = input.nextInt();

int prime = number%2;

if (prime == 0){
System.out.printf("%d is a even number", number);
}else{
System.out.printf("%d is an prime number", number);
}


}
}