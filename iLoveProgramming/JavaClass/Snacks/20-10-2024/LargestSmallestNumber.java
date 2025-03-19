import java.util.Scanner;
public class LargestSmallestNumber{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

int largest = Integer.MIN_VALUE;
int smallest = Integer.MAX_VALUE;
int quit = 0;

while(quit==0){

System.out.println("Enter a number or enter -1 to quit");
int number =input.nextInt();
if(number == -1 ){
break;
}
if(number > largest){
largest = number;
}
if(number < smallest){
smallest = number;
}
}

if(largest != Integer.MIN_VALUE && smallest != Integer.MAX_VALUE
 ){
System.out.printf("The smallest number is %d%nThe largest number is %d",smallest,largest);
}else{
System.out.print("No valid input entered");
}



}

}