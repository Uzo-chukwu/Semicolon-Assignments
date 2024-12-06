import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardValidatorTest {

    @Test
    public void testGetCardType_Visa() {
        // Given
        String cardNumber = "4123456789012345";

        // When
        String cardType = CreditCardValidator.getCardType(cardNumber);

        // Then
        assertEquals("Visa", cardType);
    }

    @Test
    public void testGetCardType_MasterCard() {
        // Given
        String cardNumber = "5123456789012345";

        // When
        String cardType = CreditCardValidator.getCardType(cardNumber);

        // Then
        assertEquals("MasterCard", cardType);
    }

    @Test
    public void testGetCardType_AmericanExpress() {
        // Given
        String cardNumber = "371234567890123";

        // When
        String cardType = CreditCardValidator.getCardType(cardNumber);

        // Then
        assertEquals("American Express", cardType);
    }

    @Test
    public void testGetCardType_Discover() {
        // Given
        String cardNumber = "601234567890123";

        // When
        String cardType = CreditCardValidator.getCardType(cardNumber);

        // Then
        assertEquals("Discover", cardType);
    }

    @Test
    public void testGetCardType_Invalid() {
        // Given
        String cardNumber = "0123456789012345";

        // When
        String cardType = CreditCardValidator.getCardType(cardNumber);

        // Then
        assertNull(cardType);
    }

    @Test
    public void testValidateCardNumber_Valid() {
        // Given
        String cardNumber = "4532015112830368";

        // When
        boolean isValid = CreditCardValidator.validateCardNumber(cardNumber);

        // Then
        assertTrue(isValid);
    }

    @Test
    public void testValidateCardNumber_Invalid() {
        // Given
        String cardNumber = "4532015112830369";

        // When
        boolean isValid = CreditCardValidator.validateCardNumber(cardNumber);

        // Then
        assertFalse(isValid);
    }
}
