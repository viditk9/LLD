package src.LLDQuestions.SnakeAndLadderGame;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int numberOfDices,min=1,max=6;

    public Dice(int numberOfDices) {
        this.numberOfDices = numberOfDices;
    }

    public int rollDice() {
        int sum=0;
        for(int i=0;i<numberOfDices;i++)
        {
            sum += ThreadLocalRandom.current().nextInt(min,max+1);
        }
        return sum;
    }
}
