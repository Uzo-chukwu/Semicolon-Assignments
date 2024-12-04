import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

	
	System.out.println("Hello, kindly Enter Card details to verify ");
	String cardNumber = input.nextLine();
	String cardType = getCardType(cardNumber);
	

} 
	private static String getCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return null;
        }
    }

	private static boolean validateCardNumber(String cardNumber){
		int sum = 0;
       		boolean doubleDigit = false;
		for (int count = cardNumber.length() - 1; count >= 0; count--){


		}


	}

}