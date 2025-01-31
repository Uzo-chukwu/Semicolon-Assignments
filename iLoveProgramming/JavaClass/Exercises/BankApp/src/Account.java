public class Account {

    public double getAccountNumber() {
        return accountNumber;
    }

    private double accountNumber;
    private double balance;
    private int pin ;
    private String accountName;

    public Account(int accountNumber, int pin, String accountName) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.accountName = accountName;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;

    }

    public void withdraw(double amount, int pin) {
        if(pin == this.pin) {
            if(amount < balance) {
                balance -= amount;
            }else{
                throw new IllegalArgumentException("Insufficient Balance");
            }
        }else{
            throw new IllegalArgumentException("Wrong Pin");
        }


    }

    public boolean updatePin(int oldPin, int newPin) {
        if(oldPin == pin){ pin = newPin; return true;}

        return false;
    }
    public boolean pinIsCorrect(int pin) {
        if(pin == this.pin){ return true;}
        return false;
    }
}
