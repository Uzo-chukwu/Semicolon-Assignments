import java.util.Random;

public class MaximumNumber{
public static void main(String [] args){

Random rand = new Random();

int firstNumber = rand.nextInt(100);
int secondNumber = rand.nextInt(100);
int thirdNumber = rand.nextInt(100);

if(firstNumber > secondNumber && firstNumber > thirdNumber ){
System.out.printf("%d is the largest number amongst %d and %d", firstNumber,secondNumber,thirdNumber); 
}else if(secondNumber > firstNumber && secondNumber > thirdNumber){
System.out.printf("%d is the largest number amongst %d and %d", secondNumber,firstNumber,thirdNumber);
}else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
System.out.printf("%d is the largest number amongst %d and %d", thirdNumber,secondNumber,firstNumber);
}




}
}
