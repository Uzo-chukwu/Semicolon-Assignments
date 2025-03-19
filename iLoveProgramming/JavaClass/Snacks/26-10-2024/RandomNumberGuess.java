import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuess{
public static void main(String [] args){
Random rand = new Random();
Scanner input = new Scanner(System.in);


while(true){
int random = rand.nextInt(10);
System.out.print("pick a number from 1 to 10: ");
int number = input.nextInt();
if(number > random){
System.out.println("Too high try again ");
}else if(number < random){
System.out.println("Too low try again ");
}else if(number == random){
System.out.println("You got it right");
break;
}


}






}
}