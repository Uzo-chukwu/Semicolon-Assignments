import java.util.Scanner;

public class EarningCalculator{
public static void main(String [] args){
Scanner input= new Scanner(System.in);

System.out.println("Enter your yearly earning and i will tell you how much you earn per month,week,day,hour,minute,second and millisecond ");
double income = input.nextInt();

double month = income / 12;
double weeks = income / 52;
double days = weeks/7 ;
double hours = days/24;
double minutes = hours/60;
double seconds = minutes/60;


System.out.printf("Months = %f%nWeeks = %f%nDays = %f%nHours = %f%nMinutes = %f%nSeconds = %f%n",month,weeks,days,hours,minutes,seconds);





}


}