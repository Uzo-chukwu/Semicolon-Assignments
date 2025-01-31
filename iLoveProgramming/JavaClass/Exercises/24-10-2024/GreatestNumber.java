import java.util.Scanner;
public class GreatestNumber{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int largest =  ;
 
int counter = 1;

while ( counter <4) {
System.out.println("Enter number "+ counter);
int number = input.nextInt();

if(number>largest)
largest=number;
counter++;


}

System.out.printf("The largest number is %d",largest);

}

} 