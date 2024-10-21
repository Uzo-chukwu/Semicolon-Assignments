import java.util.Scanner;
public class bmiTest{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your weight ");
double weight = input.nextDouble();

System.out.print("Enter your height ");
double height = input.nextDouble();

double bmi = weight / (height * height);

String category;

if (bmi < 18.5){
category = "Underweight";
}else if(bmi < 25){
category = "normal";
}else if(bmi < 30){
category = "overweight";
}else {
category = "obese";
}


System.out.printf("Your BMI is %f%n ",bmi );
System.out.print("your bmi category = "+category);








}


}