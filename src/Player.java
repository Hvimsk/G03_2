package src;

public class Player {
    public int playerPosition;
    public Account account;

    public Player(int i) {
        playerPosition = i;
        account = new Account(1000);
    }

    /**
     * gets the score from the account balance
     *
     * @return int
     */

    public int GetTotalScore() {
        return account.getBalance();
    }

    /**
     * sets the score of the account balance
     *
     * @param score to set as balance
     */

    public void SetScore(int score) {
        account.balance = score;
    }
}
