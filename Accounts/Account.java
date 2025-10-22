package day2;

/**
 * The Account class represents a generic bank account.
 * It provides basic deposit and withdraw functionality
 * and acts as a superclass for specific account types
 * such as Savings and Current accounts.
 */
public class Account {

    // Private fields to enforce encapsulation
    private int accountNumber;
    private String holderName;
    protected double balance;

    /**
     * Constructor to initialize an Account object.
     */
    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    /**
     * Withdraws an amount if the balance is sufficient.
     * @param amount the amount to withdraw
     * @return the updated balance
     */
    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
        return balance;
    }

    /**
     * Deposits a valid positive amount.
     * @param amount the amount to deposit
     * @return the updated balance
     */
    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
        }
        return balance;
    }

    // Getters for account details
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}
