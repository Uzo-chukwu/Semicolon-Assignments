import java.util.Scanner;

public class SingleNumberMultiplicationTable{
public static void main(String [] args){
Scanner input = new Scanner (System.in);


System.out.println("Enter the number");
int number = input.nextInt();

System.out.print("Enter the number of terms; ");
int numberOfTerms = input.nextInt();

int counter = 0;

while( counter <=  numberOfTerms ){

System.out.printf("%d * %d = %d%n",number,counter,number*counter);


counter++;

}



}

}