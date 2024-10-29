package src;

public class Account {
    protected int balance;
    protected Player player;

    public Account(Player player, int balance) {
        this.balance = balance;
        this.player = player;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
