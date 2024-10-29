package src;

public class Account {
    protected int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    /**
     * Returns the balance of the account
     *
     * @return int
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Deposits to the balance
     *
     * @param amount to deposit to the balance
     */
    public void deposit(int amount) {
        balance += amount;
    }

    /**
     * Withdraws from the balance
     *
     * @param amount to withdraw from balance
     */
    public void withdraw(int amount) {
        balance -= amount;
    }

    /**
     * Determine if a transaction can be performed based on the account balance
     * and the transaction amount.
     *
     * @param amount of transaction
     * @return boolean
     */
    public boolean canPerformTransaction(int amount) {
        return balance >= amount;
    }
}
