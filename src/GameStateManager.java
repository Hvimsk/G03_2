package src;

import Tests.Utility.MockRaffle;
import src.interfaces.IRaffle;

import java.util.Locale;

public class GameStateManager {
    private IRaffle raffle;
    private Locale locale;

    public GameStateManager(Locale locale, IRaffle raffle) {
        this.locale = locale;
        this.raffle = raffle;
    }



    public String PlayOneTurn(Player player) {

        LocalizationManager localizationManager = new LocalizationManager(locale);
        int[] faceValue = raffle.RaffleDices();
        var diefaces = faceValue[0] + faceValue[1];

        // If statement that controls the game.
        if (faceValue[0] + faceValue[1] == 2) {
            player.account.deposit(250);
            return localizationManager.getString("LandingOnTower");

        } else if (faceValue[0] + faceValue[1] == 3) {
            player.account.withdraw(100);
            return localizationManager.getString("LandingOnCrater");

        } else if (faceValue[0] + faceValue[1] == 4) {
            player.account.deposit(100);
            return localizationManager.getString("LandingOnPalaceGates");

        } else if (faceValue[0] + faceValue[1] == 5) {
            player.account.withdraw(20);
            return localizationManager.getString("LandingOnColdDesert");

        } else if (faceValue[0] + faceValue[1] == 6) {
            player.account.deposit(180);
            return localizationManager.getString("LandingOnWalledCity");

        } else if (faceValue[0] + faceValue[1] == 7) {
            player.account.deposit(0);
            return localizationManager.getString("LandingOnMonastery");

        } else if (faceValue[0] + faceValue[1] == 8) {
            player.account.withdraw(70);
            return localizationManager.getString("LandingOnBlackCave");

        } else if (faceValue[0] + faceValue[1] == 9) {
            player.account.deposit(60);
            return localizationManager.getString("LandingOnHutsInTheMountain");

        } else if (faceValue[0] + faceValue[1] == 10) {
            // Insert method to give extra turn, here

            player.account.withdraw(80);
            System.out.println(localizationManager.getString("LandingOnWereWall"));
            PlayOneTurn(player);
            //unreachable
            return localizationManager.getString("LandingOnWereWall");


        } else if (faceValue[0] + faceValue[1] == 11) {
            player.account.withdraw(50);
            return localizationManager.getString("LandingOnThePit");

        } else if (faceValue[0] + faceValue[1] == 12) {
            player.account.deposit(650);
            return localizationManager.getString("LandingOnGoldmine");

        } else {
            // Empty field for the return thing
            return ""; 

        }
    }
}
