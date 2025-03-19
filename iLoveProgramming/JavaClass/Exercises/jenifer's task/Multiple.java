import java.util.Scanner;
public class Multiple {
public static void main(String []args){
Scanner input = new Scanner(System.in);


System.out.println("Enter 2 integers ");
int int1= input.nextInt();
int int2= input.nextInt();

int tripled= int1*3;
int doubled= int2*2;

int answer=tripled%doubled;

if (answer == 0){
System.out.printf("%d tripled is a multiple of %d doubled ",int1,int2);
}else {
System.out.printf("%d tripled is not a multiple of %d doubled ",int1,int2);
}



}
}