package automat;

import java.util.ArrayList;
import java.util.List;

class GameMachine {
    private List<Game> games = new ArrayList<>();

    void add(Game game) {
        games.add(game);
    }

    List<Game> getGames() {
        return games;
    }

    Game findTheGame(String choice) {
        for (Game game : games) {
            if (choice.equalsIgnoreCase(game.getTitle())) {
                return game;
            }
        }
        throw new GameNotFoundException(choice);
    }


    int purchaseTheGame(Game game, int cash) {
        int chosenGamePrice = game.getPrice();
        if (chosenGamePrice > cash) {
            throw new GameIsTooExpensiveException(game);
        }
        int exchange = cash - chosenGamePrice;
        games.remove(game);
        return exchange;
    }

    boolean hasGames() {
        return !games.isEmpty();
    }


}
