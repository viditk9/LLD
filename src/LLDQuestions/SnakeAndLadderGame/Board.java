package src.LLDQuestions.SnakeAndLadderGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    int size;
    List<Cell> cells;

    public Board(int size,int snakes,int ladders) {
        this.size = size;
        cells = new ArrayList<>(Collections.nCopies(size,null));
        initializeCells();
        addSnakeAndLadders(snakes,ladders);
    }

    private void initializeCells() {
        for(int i=0;i<size;i++){
            Cell cell = new Cell();
            cells.set(i,cell);
        }
    }

    private void addSnakeAndLadders(int snakes,int ladders) {
        while(snakes>0) {
            int st = ThreadLocalRandom.current().nextInt(0,size);
            int end = ThreadLocalRandom.current().nextInt(0,size);
            if(st<=end || cells.get(st).jump!=null || cells.get(end).jump!=null) continue;
            Jump jump = new Jump(st,end);
            cells.get(st).setJump(jump);
            snakes--;
        }
        while(ladders>0){
            int st = ThreadLocalRandom.current().nextInt(0,size);
            int end = ThreadLocalRandom.current().nextInt(0,size);
            if(st>=end || cells.get(st).jump!=null || cells.get(end).jump!=null) continue;
            Jump jump = new Jump(st,end);
            cells.get(st).setJump(jump);
            ladders--;
        }
    }
}
