package automat;

class GameNotFoundException extends RuntimeException {
    GameNotFoundException(String input) {
        super("Obiekt typu " + input + " nie został znaleziony");
    }
}
