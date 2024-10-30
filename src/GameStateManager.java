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



    public String PlayOneTurn(Player player){

        LocalizationManager localizationManager = new LocalizationManager(locale);
        int[] faceValue = raffle.RaffleDices();
        var diefaces = faceValue[0]+faceValue[1];
        return localizationManager.getString("LandingOnTower");
    }
}
