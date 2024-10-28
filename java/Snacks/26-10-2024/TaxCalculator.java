import java.util.Scanner;
public class TaxCalculator{
public static void main(String [] args){
Scanner input= new Scanner(System.in);

int counter = 1;

while (counter < 4){

System.out.printf("Enter citizen %d earning: ",counter);
double earning = input.nextDouble();

if(earning <= 30000 ){
double tax = earning * 0.15 ; 
System.out.printf("citizen %d tax is %.1f%n",counter,tax);
}else if(earning > 30000 ){
double tax = earning * 0.2 ; 
System.out.printf("citizen %d tax is %.1f%n",counter,tax);
}

counter++;
}





}
}