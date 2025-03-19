import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Account> accounts = new ArrayList<>();
    private int accountsCount = 0;


    public Account createAccount(int accountNumber, int pin, String accountName) {

        Account account = new Account(accountNumber, pin, accountName);
        accounts.add(account);
        return account;
    }


    public void addAccount(Account account) {
        accounts.add(account);
        accountsCount++;
    }

    public int getAccountsCount() {
        return accountsCount;
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
        accountsCount--;
    }

    public void deposit(int accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                return;
            }
        }

    }

    public void withdraw(int accountNumber, double amount, int pinInput) {

        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                if (account.pinIsCorrect(pinInput)) {
                    account.withdraw(amount, pinInput);
                    return;
                }
            }
        }
    }

    public double checkBalance(int accountNumber, int pinInput) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                if (account.pinIsCorrect(pinInput)) {
                    return account.checkBalance();
                }
            }
        }

        return 0;
    }

    public void maketranser(int senderAccountNumber, int receiverAccountNumber, int senderPin, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == senderAccountNumber) {
                if (account.pinIsCorrect(senderPin)) {
                    account.withdraw(amount, senderPin);
                }
            }
            if (account.getAccountNumber() == receiverAccountNumber) {
                account.deposit(amount);
            }
        }
    }

    public void closeAccount(int accountNumber, int pin) {
        accounts.forEach(account -> {if (account.pinIsCorrect(pin) == false) {throw new IllegalArgumentException("wrong pin");}});
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);

    }

}