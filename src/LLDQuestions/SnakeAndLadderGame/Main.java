package src.LLDQuestions.SnakeAndLadderGame;

public class Main {
    public static void main(String args[]) {
        Game obj = new Game();
        obj.setBoard(100,5,4);
        obj.setDice(1);
        obj.addPlayer("Vidit",0);
        obj.addPlayer("Messi",0);
        obj.StartGame();
    }
}
