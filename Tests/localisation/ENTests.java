package Tests.localisation;

import Tests.Utility.MockRaffle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.GameManager;
import src.LocalizationManager;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ENTests {
        private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        private final PrintStream originalOut = System.out;

        @BeforeEach
        public void setUp() {
            // Redirect System.out to outputStreamCaptor before each test
            System.setOut(new PrintStream(outputStreamCaptor));
        }

        @AfterEach
        public void tearDown() {
            // Restore the original System.out after each test
            System.setOut(originalOut);
        }

        @Test
        public void Test_Print_Tower(){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{1, 1});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnTower"), outputStreamCaptor.toString().trim());
        }

        @Test
        public void Test_Print_Crater(){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{1, 2});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnCrater"), outputStreamCaptor.toString().trim());
        }

        @Test
        public void Test_Print_Palace_gates(){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{1, 3});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnPalaceGates"), outputStreamCaptor.toString().trim());
        }
        @Test
        public void Test_Print_Cold_Desert(){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{1, 4});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnColdDesert"), outputStreamCaptor.toString().trim());
        }

        @Test
        public void Test_Print_Walled_city(){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{1, 5});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnWalledCity"), outputStreamCaptor.toString().trim());
        }
        @Test
        public void Test_Print_Monastery(){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{1, 6});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnMonastery"), outputStreamCaptor.toString().trim());
        }

        @Test
        public void Test_Print_Black_cave(){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{2, 6});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnBlackCave"), outputStreamCaptor.toString().trim());
        }

        @Test
        public void Test_Print_Huts_in_the_mountain (){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{3, 6});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnHutsInTheMountain"), outputStreamCaptor.toString().trim());
        }
        @Test
        public void Test_Print_The_Werewall (){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{4, 6});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnWerewall"), outputStreamCaptor.toString().trim());
        }

        @Test
        public void Test_Print_The_pit(){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{5, 6});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();

            assertEquals(lm.getString("LandingOnThePit"), outputStreamCaptor.toString().trim());
        }

        @Test
        public void Test_Print_Goldmine(){
            Locale enLocale = new Locale("en", "US");
            LocalizationManager lm = new LocalizationManager(enLocale);

            ArrayList<int[]> inputsToReachEvent = new ArrayList<>() {{
                add(new int[]{6, 6});
            }};

            var TestingRaffle = new MockRaffle(inputsToReachEvent);
            var sut = new GameManager(TestingRaffle,lm);

            sut.PlayGame();
            assertEquals(lm.getString("LandingOnGoldmine"), outputStreamCaptor.toString().trim());
        }
}