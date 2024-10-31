package Tests.localisation;

import Tests.Utility.MockRaffle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.GameManager;
import src.GameStateManager;
import src.LocalizationManager;
import src.Player;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnTest {
 
    @Test
    public void Test_Print_Tower() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{1, 1});
        }};

      
        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));

        assertEquals(lm.getString("LandingOnTower"), result);
    }

    @Test
    public void Test_Print_Crater() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{1, 2});
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));

        assertEquals(lm.getString("LandingOnCrater"), result);
    }

    @Test
    public void Test_Print_Palace_gates() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{1, 3});
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));

        assertEquals(lm.getString("LandingOnPalaceGates"), result);
    }

    @Test
    public void Test_Print_Cold_Desert() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{1, 4});
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));

        assertEquals(lm.getString("LandingOnColdDesert"), result);
    }

    @Test
    public void Test_Print_Walled_city() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{1, 5});
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));

        assertEquals(lm.getString("LandingOnWalledCity"), result);
    }

    @Test
    public void Test_Print_Monastery() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{1, 6});
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));

        assertEquals(lm.getString("LandingOnMonastery"), result);
    }

    @Test
    public void Test_Print_Black_cave() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{2, 6});
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));

        assertEquals(lm.getString("LandingOnBlackCave"), result);
    }

    @Test
    public void Test_Print_Huts_in_the_mountain() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{3, 6});
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));

        assertEquals(lm.getString("LandingOnHutsInTheMountain"), result);
    }


    @Test
    public void Test_Print_The_pit() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{5, 6});
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));

        assertEquals(lm.getString("LandingOnThePit"), result);
    }

    @Test
    public void Test_Print_Goldmine() {
        Locale enLocale = new Locale("en", "US");
        LocalizationManager lm = new LocalizationManager(enLocale);

        ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
            add(new int[]{6, 6});
        }};

        var TestingRaffle = new MockRaffle(inputsToReachEvent);
        var sut = new GameStateManager(enLocale,TestingRaffle);


        String result = sut.PlayOneTurn(new Player(0));
        assertEquals(lm.getString("LandingOnGoldmine"), result);
    }
}