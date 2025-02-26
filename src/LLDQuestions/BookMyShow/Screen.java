package src.LLDQuestions.BookMyShow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Screen {
    List<Seat> seats;

    public Screen() {
        this.seats = new ArrayList<>(Collections.nCopies(100, new Seat()));
    }
}
