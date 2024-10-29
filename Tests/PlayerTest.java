package Tests;

import org.junit.jupiter.api.Test;
import src.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    /**
     * Test that we get the correct balance/score.
     */
    @Test
    void getScore() {
        Player playerInstance = new Player(1);
        int score = playerInstance.GetTotalScore();
        assertEquals(1000, score);
    }


    /**
     * Test that the balance/score is set correctly
     */
    @Test
    void setScore() {
        Player playerInstance = new Player(1);
        int testScore = 150;
        playerInstance.SetScore(testScore);
        int score = playerInstance.GetTotalScore();
        assertEquals(150, score);
    }
}