package src.LLDQuestions.TicTacToe;

import src.LLDQuestions.TicTacToe.Models.Board;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        String winner = game.startGame();
        if(winner=="tie") {
            System.out.println("Game is tied");
        } else {
            System.out.println("Game winner is: " + game.startGame());
        }

    }

}
