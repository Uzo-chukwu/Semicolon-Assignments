import java.util.Scanner;

public class EfficiencyCalculator{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int quit = 1;

while(quit != 0){

System.out.print("Enter the time required for a worker to complete a task: ");
double workTime = input.nextDouble();

if(workTime >= 2 && workTime <3 ){
System.out.println("Worker is highly efficient ");
}else if(workTime >= 3 && workTime <4 ){
System.out.println("order worker to improve speed ");
}else if(workTime >= 4 && workTime <=5 ){
System.out.println("enrol worker for speed improvement training ");
}else if(workTime > 5  ){
System.out.println("Fire that worker ");
}
System.out.print("Do you want to continue? enter 1 to continue 0 to quit: ");
quit = input.nextInt();




}



}
}