package src.LLDQuestions.SnakeAndLadderGame;

public class Cell {
    Jump jump;

    public Cell() {
        this.jump = null;
    }

    public Jump getJump() {
        return jump;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }
}
