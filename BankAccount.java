// BankAccount.java
import java.util.Scanner;
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

// ATM.java


public class ATM extends BankAccount{
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            displayMenu();
            int option = getOptionFromUser();
            processOption(option);
        }
    }

    private void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Exit");
    }

    private int getOptionFromUser() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawCash();
                break;
            case 3:
                depositCash();
                break;
            case 4:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    private void withdrawCash() {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Your new balance is: $" + account.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount. Please try again.");
        }
    }

    private void depositCash() {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful. Your new balance is: $" + account.getBalance());
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // initial balance of $1000
        ATM atm = new ATM(account);
        atm.run();
    }
}