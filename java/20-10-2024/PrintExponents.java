public class PrintExponents{
public static void main(String [] args){

System.out.println("a     b     pow(a, b)"); 

double a=1;
double b=2;
do{
System.out.printf("%.0f     %.0f     %.0f%n", a,b,(Math.pow(a,b)));

a++;
b++;
}while(a<6);





 }
}