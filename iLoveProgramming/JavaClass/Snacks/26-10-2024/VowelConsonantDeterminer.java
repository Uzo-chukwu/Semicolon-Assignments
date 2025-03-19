import java.util.Scanner;
public class VowelConsonantDeterminer {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

while(true) {

System.out.println("Enter an alphabet: ");
String alphabet = input.nextLine();
int length = alphabet.length();

if (length != 1) {
System.out.println("You made a wrong input. Please enter a single alphabet.");
continue;
}if (alphabet.equals("A") || alphabet.equals("E") || alphabet.equals("I") || alphabet.equals("O") || alphabet.equals("U") || alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u")) {
System.out.println("You entered a vowel");} else {
System.out.println("You entered a consonant");

System.out.print("Do want to continue after this enter 0 to quit or 1 to continue ");
int stopper=input.nextInt();
if (stopper==0){
break;
}

}
}
}
}