package src;

import src.interfaces.IRaffle;

public class GameManager {
    private IRaffle raffle;
    public GameManager(IRaffle raffle, LocalizationManager lm) {
        this.raffle = raffle;
    }



    public void PlayGame() {
    }
}
