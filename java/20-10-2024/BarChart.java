import java.util.scanner;
public class BarChart{
public static void main(String [] args){
Scanner input= new Scanner(system.in);

int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;

System.out.print("Enter first number (1-30): ");
firstNumber = input.nextInt();

System.out.print("Enter second number (1-30): ");
secondNumber = input.nextInt();

System.out.print("Enter third number (1-30): ");
thirdNumber = input.nextInt();

System.out.print("Enter fourth number (1-30): ");
fourthNumber = input.nextInt();

System.out.print("Enter fifth number (1-30): ");
fifthNumber = input.nextInt();

System.out.println("\nBar Chart:");

for (int i = 0; i < firstNumber; i++) {
System.out.print("*");
}
System.out.println();

for (int i = 0; i < secondNumber; i++) {
System.out.print("*");
}
System.out.println();

for (int i = 0; i < thirdNumber; i++) {
System.out.print("*");
}
System.out.println();

for (int i = 0; i < fourthNumber; i++) {
System.out.print("*");
 }
System.out.println();

for (int i = 0; i < fifthNumber; i++) {
System.out.print("*");
 }
System.out.println();


}
}

}

}