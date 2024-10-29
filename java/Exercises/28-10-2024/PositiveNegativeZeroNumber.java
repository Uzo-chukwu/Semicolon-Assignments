import java.util.Scanner;

public class PositiveNegativeZeroNumber{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
int number = 0;

while(number!=-1){


System.out.print("Enter any number enter -1 when you're done ");
number = input.nextInt();
if(number > 0){
System.out.println("positive!");
}else if(number < 0){
System.out.println("negative!");
}else{
System.out.println("zero");
}





}

}




}
