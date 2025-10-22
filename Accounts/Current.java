package day2;

/**
 * Current account with transaction limits for both
 * deposits and withdrawals.
 */
public class Current extends Account {

    private static final double MAX_WITHDRAW = 50000.0;
    private static final double MAX_DEPOSIT = 500000.0;

    public Current(int no, String name, double balance) {
        super(no, name, balance);
    }

    /**
     * Allows withdrawal up to MAX_WITHDRAW if sufficient funds are available.
     */
    @Override
    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= MAX_WITHDRAW && balance >= amount) {
            balance -= amount;
        } else if (amount > MAX_WITHDRAW) {
            System.out.println("Withdrawal exceeds allowed limit.");
        } else {
            System.out.println("Insufficient funds.");
        }
        return balance;
    }

    /**
     * Allows deposits up to MAX_DEPOSIT.
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
        Current a2 = new Current(2, "EFG", 200000);
        System.out.println("Initial Balance: " + a2.getBalance());
        a2.deposit(4999);
        System.out.println("After Deposit: " + a2.getBalance());
        a2.withdraw(42000);
        System.out.println("After Withdrawal: " + a2.getBalance());
    }
}
