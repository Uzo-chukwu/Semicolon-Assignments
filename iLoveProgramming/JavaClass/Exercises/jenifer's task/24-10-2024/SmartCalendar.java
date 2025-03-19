import java.util.Scanner;
public class SmartCalendar{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Input a month number: "); 
int month =input.nextInt();

System.out.println("Input a year: "); 
int year =input.nextInt();


if (month == 1){
System.out.printf("January %d has 31 days ", year);
}else if(month == 2 && (year % 4 == 0)){
System.out.printf("febuary %d has 29 days ", year);
}else if(month == 3){
System.out.printf("march %d has 31 days ", year);
}else if(month == 4){
System.out.printf("april %d has 30 days ", year);
}else if(month == 5){
System.out.printf("may %d has 31 days ", year);
}else if(month == 6){
System.out.printf("june %d has 30 days ", year);
}else if(month == 7){
System.out.printf("July %d has 31 days ", year);
}else if(month == 8){
System.out.printf("August %d has 31 days ", year);
}else if(month == 9){
System.out.printf("september %d has 31 days ", year);
}else if(month == 10){
System.out.printf("october %d has 31 days ", year);
}else if(month == 11){
System.out.printf("november %d has 30 days ", year);
}else if(month == 12){
System.out.printf("December %d has 31 days ", year);
}else if(month == 2){
System.out.printf("Febuary %d has 28 days ", year);
}

















}
}