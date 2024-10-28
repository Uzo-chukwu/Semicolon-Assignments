import java.util.Scanner;
public class LeapYearDeterminer{
public static void main(String [] args){
Scanner input= new Scanner(System.in);

System.out.print("Enter the year: ");
int year = input.nextInt();
int leapyear= year%4; 
if(leapyear == 0){
System.out.printf("%d is a leap year ",year);
}else{
System.out.printf("%d is not a leap year ",year);
}
 
}
}