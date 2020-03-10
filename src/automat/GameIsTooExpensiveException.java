package automat;

public class GameIsTooExpensiveException extends RuntimeException {
    public GameIsTooExpensiveException(Game game) {
        super("Gra " + game.getTitle() + " jest droższa. Wprowadź poprawną kwotę " + game.getPrice());
    }
}
