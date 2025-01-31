import java.security.SecureRandom;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println("What do you want to do?");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Check Balance");
        System.out.println("6. Update Pin");
        System.out.println("7. Close Account");
        System.out.println("8. Exit");
        Scanner input = new Scanner(System.in);
        String option = input.next();
        switch (option) {
            case "1":
                SecureRandom random = new SecureRandom();
                int accountNumber = random.nextInt(1000,9999);
                System.out.println("Enter Your name");
                String name = input.nextLine();
                System.out.println("Enter Your pin");
                int pin = input.nextInt();
                createNewAccount(accountNumber,name,pin);

            case "2":


        }


    }
    public static void createNewAccount(int accountNumber,String name,int Pin){
        Bank bank = new Bank();
        bank.addAccount(bank.createAccount(accountNumber,Pin,name));
        System.out.println("Account created Succesfully");
    }
    public static void deposit(int accountNumber, double amount){
        Bank bank = new Bank();
        bank.deposit(accountNumber,amount);
        System.out.printf("% Deposited succesfully",amount);
    }
}
