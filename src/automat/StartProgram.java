package automat;

class StartProgram {


    void programDemo() {
        GameMachine gameMachine = makeRepositoryOfGame();
        interactions(gameMachine);
    }


    private GameMachine makeRepositoryOfGame() {
        GameMachine gameMachine = new GameMachine();
        gameMachine.add(new Batman());
        gameMachine.add(new AC());
        gameMachine.add(new Witcher());
        return gameMachine;

    }

    private void interactions(GameMachine gameMachine) {
        GameMachineController gameMachineController = new GameMachineController(gameMachine, new Custumer());
        gameMachineController.start();
    }
}
