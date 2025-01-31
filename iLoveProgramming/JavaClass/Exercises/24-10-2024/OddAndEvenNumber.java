import java.util.Scanner;
public class OddAndEvenNumber{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();
int determiner = number%2;

if (determiner == 0){
  System.out.println("1");
}
if(determiner != 0){
System.out.println("0");



}







}
}