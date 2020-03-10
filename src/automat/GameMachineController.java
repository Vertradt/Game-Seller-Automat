package automat;

class GameMachineController {
    private GameMachine gameMachine;
    private Custumer custumer;

    GameMachineController(GameMachine gameMachine, Custumer custumer) {
        this.gameMachine = gameMachine;
        this.custumer = custumer;
    }

    void start() {
        while (gameMachine.hasGames()) {
            pickAndBuyGameHandle();
        }
    }

    private void pickAndBuyGameHandle() {
        try {
            pickAndBuyGame();
        } catch (GameNotFoundException | GameIsTooExpensiveException e) {
            System.out.println(e.getMessage());
        }
    }

    private void pickAndBuyGame() {
        displayAllGames();
        Game game = pickTheGame();
        int exchange = purchase(game);
        showPurchased(game, exchange);

    }

    private void displayAllGames() {
        System.out.println("Dostępne przedmioty to:");
        for (Game game : gameMachine.getGames()) {
            System.out.println(game);
        }
    }


    private Game pickTheGame() {
        String input = customerPick();
        Game choosenGame = gameMachine.findTheGame(input);
        System.out.println("Wybrano grę. \n" + choosenGame);
        return choosenGame;
    }

    private String customerPick() {
        System.out.println("Wybierz grę wpisując jej nazwę");
        return custumer.doChoose();
    }


    private int purchase(Game game) {
        int cash = customerPayment();
        return gameMachine.purchaseTheGame(game, cash);

    }

    private int customerPayment() {
        System.out.println("Wprowadź opłatę.");
        return custumer.pay();
    }

    private void showPurchased(Game game, int exchange) {
        System.out.println("Zakupiłeś grę \n" + game);
        if (exchange != 0) {
            System.out.println("Twoja reszta to " + exchange);
        }
    }


}
