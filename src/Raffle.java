package src;

import src.interfaces.IRaffle;

public class Raffle implements IRaffle {
    private final Die die1 = new Die();
    private final Die die2 = new Die();

    /**
     * Raffle dices
     *
     * @return int[]
     */

    @Override
    public int[] RaffleDices() {
        int faceValue1 = die1.Roll();
        int faceValue2 = die2.Roll();
        return new int[]{faceValue1, faceValue2};
    }
}
