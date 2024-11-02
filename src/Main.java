package src;

import src.interfaces.IRaffle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("[1]: English\n[2]: Dansk");
        int input = scanner.nextInt();
        LocalizationManager localizationManager = LocalizationManager.getInstance(Locale.ENGLISH);
        if (input == 2){
            Locale daLocale = new Locale("da", "DK");
            localizationManager = LocalizationManager.getInstance(daLocale);
        }else{
            System.out.println("Invalid input");
        }
        Raffle ProductionRaffle = new Raffle(new Die(), new Die());
        GameManager currentGame = new GameManager(ProductionRaffle, localizationManager);
        int PlayerWhoWon = currentGame.PlayGame().playerPosition + 1;
        System.out.println("Congratulation, Player: "+PlayerWhoWon +" Won");
    }
}
