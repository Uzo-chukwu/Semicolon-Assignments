/*(Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. Use the techniques shown in Fig. 2.15 */


import java.util.Scanner;
public class ComparingIntegers{
public static void main(String [] args){
Scanner input= new Scanner(System.in);

System.out.print("Enter an integer");
int number = input.nextInt();

int square = number * number;


if( number > 100 && square > 100){
System.out.printf("%d and %d is greater than 100", number, square);
}else if(number < 100 && square < 100){
System.out.printf("%d and %d is less than 100", number, square);
}else if(number == 100 && square == 100){
System.out.printf("%d and %d is equal to 100", number, square);
}else{
System.out.printf("%d and %d is not equal to 100", number, square);
}



}
}
