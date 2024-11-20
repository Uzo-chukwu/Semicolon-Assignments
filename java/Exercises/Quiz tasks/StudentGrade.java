
import java.util.Scanner;
public class StudentGrade{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the student's mark:");
int mark = input.nextInt();

if(mark < 33){
	System.out.print("Fail");
}if(mark > 32 & mark <40){
	System.out.print("Pass");
}if(mark > 39 & mark <60){
	System.out.print("Second Class");
}if(mark > 59 & mark <80){
	System.out.print("First Class");
}if(mark > 79 ){
	System.out.print("Distinction");
}

}
}