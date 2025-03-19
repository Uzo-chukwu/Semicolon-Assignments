import java.util.Scanner;
public class LastDigitDeterminer{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter three numbers: ");
int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();

int lastDigit1 = num1%10;
int lastDigit2 = num2%10;
int lastDigit3 = num3%10;


if (lastDigit1 == lastDigit2 ){

System.out.println("True");

}else if (lastDigit1 == lastDigit3 ){

System.out.println("True");
}else if (lastDigit2 == lastDigit3 ){

System.out.println("True");
}else if (lastDigit2 == lastDigit1 ){

System.out.println("True");
}else if (){
System.out.println("Nothing will happen");

}




}





}
