import java.util.Scanner;
public class PowerCalculator{
public static void main(String [] args){
Scanner input= new Scanner(System.in);

System.out.println("Enter the base number: ");
int base = input.nextInt();

System.out.println("Enter the exponent: ");
int exponent = input.nextInt();

int result = 1;

for(int counter = 0; counter < exponent; counter++)  {

result = result*base;

}

System.out.printf("%d raised to power %d = %d", base, exponent,result);





}

} 