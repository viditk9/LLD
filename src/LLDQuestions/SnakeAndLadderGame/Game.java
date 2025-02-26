package src.LLDQuestions.SnakeAndLadderGame;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> deque;
    Player winner;
    Game() {
        winner = null;
        deque = new LinkedList<>();
    }

    public void setBoard(int size,int snakes,int ladders) {
        board = new Board(size,snakes,ladders);
    }

    public void setDice(int numberOfDices) {
        dice = new Dice(numberOfDices);
    }

    public void addPlayer(String name, int startPos) {
        Player newPlayer = new Player(name,startPos);
        deque.add(newPlayer);
    }

    public void StartGame() {
        while(winner == null) {
            Player currPlayer = deque.removeFirst();
            deque.addLast(currPlayer);
            int diceNumbers = dice.rollDice();

            int newPosition = changePlayerPos(diceNumbers, currPlayer.postion);
            currPlayer.postion = newPosition;
            System.out.println("player turn is:" + currPlayer.name + " new Position is: " + newPosition);
            //check for winning condition
            if(newPosition == board.size-1){

                winner = currPlayer;
            }
        }
        System.out.println("WINNER IS:" + winner.name);
    }

    private int changePlayerPos(int diceNumber, int pos) {
        int newPos = diceNumber+pos;
        if(newPos<0 || newPos>=board.size) return pos;
        Jump jump = board.cells.get(newPos).getJump();
        if(jump!=null) newPos = jump.end;
        return newPos;
    }
}
