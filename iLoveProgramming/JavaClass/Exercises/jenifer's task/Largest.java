import java.util.Scanner;
public class Largest{
public static void main(String []args){
Scanner input = new Scanner(System.in);

System.out.println("Enter 3 integers");
int int1 = input.nextInt();
int int2 = input.nextInt();
int int3 = input.nextInt();

int sum = int1 + int2 + int3;
int average = sum/3;
int product = int1 + int2 + int3;
System.out.printf("Sum = %d%n Average = %d%n Product =%d%n ", sum,average,product);
if(int1> int2 && int1> int3 ){
System.out.print("int1 is the largest number");
}if(int1< int2 && int1< int3 ){
System.out.print("int1 is the smallest number");
}if(int2> int1 && int2> int3 ){
System.out.print("int2 is the largest number");
}if(int2< int1 && int2< int3 ){
System.out.print("int2 is the smallest number");
}if(int3> int1 && int3> int2 ){
System.out.print("int3 is the largest number");
}if(int3< int1 && int3< int2 ){
System.out.print("int3 is the smallest number");
}






}

}