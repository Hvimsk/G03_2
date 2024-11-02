package src;

import src.interfaces.IRaffle;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
    private IRaffle raffle;
    private final ArrayList<Player> players;
    private LocalizationManager localizationManager;
    GameStateManager gameStateManager;
    public GameManager(IRaffle raffle, LocalizationManager lm) {
        this.localizationManager = lm;
        this.raffle = raffle;
        this.gameStateManager = new GameStateManager(lm.getLocale(), raffle);
        players = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            players.add(new Player(i));
        }
    }



    public Player PlayGame() {
        int currentPlayer = 0;
        while (true){
            if (players.get(currentPlayer).hasPlayerWon()) {
                return players.get(currentPlayer);
            }
            System.out.println("player [" + (currentPlayer+1) +"] Turn. Press any key to continue...");
            var scanner = new Scanner(System.in);
            var input = scanner.nextInt();
            String current = gameStateManager.PlayOneTurn(players.get(currentPlayer));
            if (current == "LandingOnWereWall"){
                System.out.println(localizationManager.getString("LandingOnWereWall") + " BALANCE: [" + players.get(currentPlayer).account.getBalance()+"]");
            }else {
                System.out.println(current + " BALANCE: [" + players.get(currentPlayer).account.getBalance()+"]");
                currentPlayer++;
                if (currentPlayer >= players.size()) {
                    currentPlayer = 0;
                }
            }
        }
    }
}
