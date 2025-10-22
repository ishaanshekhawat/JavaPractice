package day2;

/**
 * Savings account with minimum balance requirement
 * and maximum deposit limit.
 */
public class Savings extends Account {

    // Minimum balance requirement for savings account
    private static final double MIN_BALANCE = 10000.0;
    // Maximum deposit limit per transaction
    private static final double MAX_DEPOSIT = 100000.0;

    public Savings(int no, String name, double balance) {
        super(no, name, balance);
    }

    /**
     * Withdraws only if balance stays above minimum requirement.
     */
    @Override
    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Cannot withdraw: balance would fall below minimum limit.");
        }
        return balance;
    }

    /**
     * Deposits only if within the allowed limit.
     */
    @Override
    public double deposit(double amount) {
        if (amount > 0 && amount <= MAX_DEPOSIT) {
            balance += amount;
        } else {
            System.out.println("Deposit exceeds allowed limit or is invalid.");
        }
        return balance;
    }

    public static void main(String[] args) {
        Savings a1 = new Savings(1, "ABC", 40000);
        System.out.println("Initial Balance: " + a1.getBalance());
        a1.deposit(4999);
        System.out.println("After Deposit: " + a1.getBalance());
        a1.withdraw(31000);
        System.out.println("After Withdrawal: " + a1.getBalance());
    }
}
