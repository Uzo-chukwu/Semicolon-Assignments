import java.util.Scanner;
public class BmiCalculator{
public static void main(String []args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your weight in kg");
double weight = input.nextDouble();

System.out.print("Enter your height");
double height = input.nextDouble();

double bmi = weight / (height * height)   ;
String category;
if (bmi < 18.5) {
category= "You're Underweight";
}else if(bmi <25 ){
category = "Your weight is Normal";
}else if(bmi < 30  ){
category = "You are overweight";
}else{
category = "You are overweight";
}

System.out.printf("Your bmi is %f%n ",  bmi);
System.out.println("Your bmi category is "+category);

}
} 




 Util package in Java is a built-in package that contains several pre-written utility classes and interfaces. The import java. util. *; statement can be used to load the contents of the java. util package in a Java program