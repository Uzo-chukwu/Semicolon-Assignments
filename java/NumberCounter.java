/** This program collects the 5 integers from the user and
 counts how many of the integers is positive, negative and Zero*/

import java.util.Scanner;
public class NumberCounter{
public static void main(String [] args){
Scanner input= new Scanner(System.in);


int negativeCounter =0;
int positiveCounter=0;
int zeroCounter=0;
int numberCounter=0;


while (numberCounter <5){

System.out.println("Enter an integer");
int number = input.nextInt();

if(number < 0){
negativeCounter++;
}else if(number == 0){
zeroCounter++;
}else{
positiveCounter++;
}
numberCounter++;

}



System.out.printf("There are %d positive numbers%nThere are %d negative numbers%nThere are %d zero numbers",positiveCounter, negativeCounter, zeroCounter);






}
}