import java.util.Scanner;
public class SumOfNaturalNumbers{
public static void main(String [] args){
Scanner input= new Scanner(System.in);
 

System.out.print("Enter the last number in the sequence:   ");
int lastNumber = input.nextInt();

int sum = (lastNumber *(lastNumber + 1)) / 2;

System.out.printf("The sum of the first %d natural number is %d", lastNumber,sum  );










}
}