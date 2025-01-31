import java.util.Scanner;

public class TimeCalculator{
public static void main(String [] args){
Scanner input= new Scanner(System.in);

System.out.println("Enter the number of years and i will tell you how many months,weeks,days,hours,minutes,seconds and millisecond at are in the year yo entered ");
int year = input.nextInt();

int month = year * 12;
int weeks = year * 52;
int days = year * 365;
int hours = days * 24;
int minutes = hours * 60;
int seconds = minutes * 60;
int milliseconds = seconds * 1000;

System.out.printf("Months = %d%nWeeks = %d%nDays = %d%nHours = %d%nMinutes = %d%nSeconds = %d%nMlliseconds = %d",month,weeks,days,hours,minutes,seconds,milliseconds);





}


}