import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testAccount() {
        Account account1 = new Account(12345,1111,"Uzo");

    }
    @Test
    public void testCheckBalance() {
        Account account1 = new Account(12345,1111,"Uzo");
        account1.checkBalance();
        assertEquals(0, account1.checkBalance());
    }
    @Test
    public void testDepositIncreasesBalance() {
        Account account1 = new Account(12345,1111,"Uzo");
        account1.deposit(1000);
        assertEquals(1000, account1.checkBalance());
    }
    @Test
    public void testWithdrawReducesBalance() {
        Account     account1 = new Account(12345,1111,"Uzo");
        account1.deposit(1000);
        account1.withdraw(500,1111);
        assertEquals(500, account1.checkBalance());
    }


    @Test
    public void testUpdatePin() {
        Account account1 = new Account(12345,1111,"Uzo");
        boolean newPin = account1.updatePin(1111,2222);
        assertTrue(newPin);
    }

}
