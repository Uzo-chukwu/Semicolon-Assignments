import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void testCreateAccount() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount(12345,1111,"Uzo");
        Account account2 = bank.createAccount(12345,2222,"Taiwo");

    }
    @Test
    public void testAddAccount() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount(12345,1111,"Uzo");
        bank.addAccount(account1);
        assertEquals(1, bank.getAccountsCount());
    }
    @Test
    public void testRemoveAccount() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount(12344,1111,"Uzo");
        Account account2 = bank.createAccount(12345,2222,"Taiwo");
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.removeAccount(account1);
        assertEquals(1, bank.getAccountsCount());
    }
    @Test
    public void testDeposit() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount(12345, 1111, "Uzo");
        Account account2 = bank.createAccount(12344, 2222, "Taiwo");
        Account account3 = bank.createAccount(12335, 3333, "Kenny");
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.deposit(12344, 2000);
        assertEquals(2000, account2.checkBalance());
    }
    @Test
    public void testWithdrawal() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount(12345, 1111, "Uzo");
        Account account2 = bank.createAccount(12344, 2222, "Taiwo");
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.deposit(12344, 2000);
        bank.withdraw(12344,100,2222);
        assertEquals(1900, account2.checkBalance());
        }
    @Test
    public void testCheckBalance() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount(12345, 1111, "Uzo");
        Account account2 = bank.createAccount(12344, 2222, "Taiwo");
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.deposit(12344, 2000);
        double balance = bank.checkBalance(12344,2222);
        assertEquals(2000, balance);

    }
    @Test
    public void testTransfer() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount(12345, 1111, "Uzo");
        Account account2 = bank.createAccount(12344, 2222, "Taiwo");
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.deposit(12344, 2000);
        bank.maketranser(12344,12345,2222,100);
                                                      assertEquals(1900, account2.checkBalance());
        assertEquals(100, account1.checkBalance());
    }
    @Test
    public void testCloseAccount() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount(12345, 1111, "Uzo");
        Account account2 = bank.createAccount(12344, 2222, "Taiwo");
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.closeAccount(12345,1111);
        assertEquals(1, bank.getAccountsCount());

    }

    }



