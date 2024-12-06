import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

	
	System.out.println("Hello, kindly Enter Card details to verify ");
	String cardNumber = input.nextLine();
	String cardType = getCardType(cardNumber);
	if (cardType == null) {
            System.out.println("Invalid card type.");
            return;
        }
        boolean isValid = validateCardNumber(cardNumber);

	System.out.println("*********************************");
        System.out.println("Credit Card Type: " + cardType);
	System.out.println("Credit Card Number: " + cardNumber );
	System.out.println("Credit Card Digit Length: " + cardNumber.length() );
        System.out.println("Credit card Validity Status: " + (isValid ? "Valid" : "Invalid"));
	System.out.println("*********************************");

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

	private static boolean validateCardNumber(String cardNumber) {
  		int sumOfDoubledPlacedDigits = 0;
    		int sumOfOddPlaceDigits = 0;
   		

   	for (int count = cardNumber.length() - 1; count >= 0; count =-2) {
        	int digitsInOddPlaces = Character.getNumericValue(cardNumber.charAt(count));
        	sumOfOddPlaceDigits += digitsInOddPlaces;
       	}
	for (int count = cardNumber.length() - 2; count >= 0; count =-2) {
        	int digitsInDoublePlaces = Character.getNumericValue(cardNumber.charAt(count));
		digitsInDoublePlaces *= 2;
            		if (digitsInDoublePlaces > 9) 
                		digitsInDoublePlaces -= 9;
           	sumOfDoubledPlacedDigits += digitsInDoublePlaces;	
            		
           }
       		
       
   	

    	return (sumOfDoubledPlacedDigits + sumOfOddPlaceDigits) % 10 == 0;
}

}