package src.LLDQuestions.BookMyShow;

import java.util.List;

public class Booking {
    List<Seat> selectedSeats;
    Show show;

    public Booking(List<Seat> selectedSeats, Show show) {
        this.selectedSeats = selectedSeats;
        this.show = show;
    }


}
