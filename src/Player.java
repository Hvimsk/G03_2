package src;

public class Player {
    public int playerPosition;
    public Account account;

    public Player(int i) {
        playerPosition = i;
        this.account = new Account(1000);
    }

    public int GetTotalScore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void SetScore(int testScore) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
