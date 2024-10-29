package src;

import src.interfaces.IDie;
import src.interfaces.IRaffle;

public class Raffle implements IRaffle {
    private final IDie die1;
    private final IDie die2;

    public Raffle(IDie die1, IDie die2) {
        this.die1 = die1;
        this.die2 = die2;
    }

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
