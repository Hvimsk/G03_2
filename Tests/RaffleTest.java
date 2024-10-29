package Tests;

import Tests.Utility.DistributionOfRolls;
import org.junit.jupiter.api.Test;
import src.Die;
import src.Raffle;
import src.interfaces.IDie;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RaffleTest {

    @Test
        /*
         * Test that our Dice are showing values within the expected range
         */
    void raffle() {
        IDie die1 = new Die();
        IDie die2 = new Die();
        Raffle raffle = new Raffle(die1, die2);

        int[] DieValues = raffle.RaffleDices();

        int lowerBound = 1;
        int upperBound = 6;

        for (int faceValue : DieValues) {
            assertTrue(faceValue >= lowerBound && faceValue <= upperBound, "Value is not in range!");
        }
    }

    @Test
        /*
         * Test that our Dice are showing values within the expected range
         */
    void raffle1000Times() {
        IDie die1 = new Die();
        IDie die2 = new Die();
        Raffle raffle = new Raffle(die1, die2);

        DistributionOfRolls utilityClass = new DistributionOfRolls();

        for (int i = 0; i < 1000; i++) {
            int[] DieValues = raffle.RaffleDices();
            utilityClass.addValue(DieValues[0]);
            utilityClass.addValue(DieValues[1]);
        }

        for (double PercentageDistribution : utilityClass.calculateDistribution()) {
            assertTrue(12 < PercentageDistribution && PercentageDistribution < 20);
        }
    }


}