package Tests;

import Tests.Utility.MockRaffle;
import org.junit.jupiter.api.Test;
import src.GameManager;
import src.LocalizationManager;
import src.Player;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameManagerTests {

    @Test
    public void player1Wins() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{1, 1});// 1250
            add(new int[]{1, 2});// 900
            add(new int[]{1, 1});// 1500
            add(new int[]{1, 2});// 800
            add(new int[]{1, 1});// 1750
            add(new int[]{1, 2});//  700
            add(new int[]{1, 1});// 2000
            add(new int[]{1, 2});// 600
            add(new int[]{1, 1});// 2250
            add(new int[]{1, 2});// 500
            add(new int[]{1, 1});// 2500
            add(new int[]{1, 2});// 400
            add(new int[]{1, 1});// 2750
            add(new int[]{1, 2});// 300
            add(new int[]{1, 1});// 3000
            add(new int[]{1, 2});// 200
        }};
        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameManager(TestingRaffle, lm);
        // Prepare fake user input: Enter key (newline) after each prompt
        String simulatedUserInput = "1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n";
        InputStream originalIn = System.in; // Save original System.in
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        try {
            Player playerWhoWon = sut.PlayGame();
            assertEquals(1, playerWhoWon.playerPosition + 1);
        } finally {
            System.setIn(originalIn); // Restore original System.in after test
        }

    }

    @Test
    public void DoubleTurn() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{1, 1});// 1250     player: 1
            add(new int[]{1, 1});// 1250     player: 2
            add(new int[]{1, 1});// 1500     player: 1
            add(new int[]{1, 1});// 1500     player: 2
            add(new int[]{1, 1});// 1750     player: 1
            add(new int[]{1, 1});// 1750     player: 2
            add(new int[]{1, 1});// 2000     player: 1
            add(new int[]{1, 1});// 2000     player: 2
            add(new int[]{1, 1});// 2250     player: 1
            add(new int[]{1, 1});// 2250     player: 2
            add(new int[]{1, 1});// 2500     player: 1
            add(new int[]{1, 1});// 2500     player: 2
            add(new int[]{1, 1});// 2750     player: 1
            add(new int[]{1, 1});// 2750     player: 2
            add(new int[]{5, 5});// 2670     player: 1        double turn
            add(new int[]{6, 6});// 3330     player: 1
            add(new int[]{1, 2});// 3330     player: 1
        }};
        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameManager(TestingRaffle, lm);



        String simulatedUserInput = "1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n";
        InputStream originalIn = System.in; // Save original System.in
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        try {
            Player playerWhoWon = sut.PlayGame();
            assertEquals(1, playerWhoWon.playerPosition + 1);
        } finally {
            System.setIn(originalIn); // Restore original System.in after test
        }
    }

    @Test
    public void TestAllFields() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{1, 1});// 1250     player: 1
            add(new int[]{1, 2});// 900     player: 2
            add(new int[]{1, 2});// 1150     player: 1
            add(new int[]{1, 2});// 800     player: 2
            add(new int[]{1, 3});// 1250     player: 1
            add(new int[]{1, 2});// 700     player: 2
            add(new int[]{1, 4});// 1230     player: 1
            add(new int[]{1, 2});// 600     player: 2
            add(new int[]{1, 5});// 1410     player: 1
            add(new int[]{1, 2});// 500     player: 2
            add(new int[]{1, 6});// 1410     player: 1
            add(new int[]{1, 2});// 400     player: 2
            add(new int[]{2, 6});// 1340     player: 1
            add(new int[]{1, 2});// 300     player: 2
            add(new int[]{3, 6});// 1400     player: 1        double turn
            add(new int[]{1, 2});// 200     player: 2
            add(new int[]{4, 6});// 1320     player: 1
            add(new int[]{5, 6});// 1270     player: 1
            add(new int[]{1, 2});// 100     player: 2
            add(new int[]{6, 6});// 1920     player: 1
            add(new int[]{1, 2});// 0     player: 2
            add(new int[]{6, 6});// 2570     player: 1
            add(new int[]{6, 6});// 650     player: 2
            add(new int[]{6, 6});// 2570     player: 1
            add(new int[]{6, 6});// 2570     player: 1
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameManager(TestingRaffle, lm);

        String simulatedUserInput = "1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n 1 \n";
        InputStream originalIn = System.in; // Save original System.in
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        try {
            Player playerWhoWon = sut.PlayGame();
            assertEquals(1, playerWhoWon.playerPosition + 1);
        } finally {
            System.setIn(originalIn); // Restore original System.in after test
        }
    }
}
