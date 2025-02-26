package src.LLDQuestions.BookMyShow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Main {
    public static void main(String args[]) {
        BookMyShow bms = BookMyShow.getInstance();
        List<Theatre> theatreList = getData();
        bms.setTheatreList(theatreList);

        List<Movie> movies = bms.getMoviesForCity(City.Bangalore);
        if(!movies.isEmpty()) {
            Movie movie = movies.get(0);
            List<Show> shows = bms.getShowsForMovieAndCity(movie,City.Bangalore);
            List<Integer> selectedSeatNumbers = new ArrayList<>();
            selectedSeatNumbers.add(29);
            Show selectedShow = shows.get(0);

            createBooking(selectedShow,selectedSeatNumbers);

            createBooking(selectedShow,selectedSeatNumbers);
        } else {
            System.out.println("No movies available for this city");
        }
    }

    public static void createBooking(Show selectedShow,List<Integer> selectedSeatNumbers) {

        boolean bookingPossible = true;
        for(int i=0;i<selectedShow.screen.seats.size();i++) {
            if(selectedSeatNumbers.contains(i) && selectedShow.screen.seats.get(i).isOccupied) {
                bookingPossible = false;
                break;
            }
        }
        if( bookingPossible ) {
            List<Seat> selectedSeats = new ArrayList<>();
            for(int i=0;i<selectedShow.screen.seats.size();i++) {
                if(selectedSeatNumbers.contains(i)) {
                    selectedShow.screen.seats.get(i).isOccupied = true;
                    selectedSeats.add(selectedShow.screen.seats.get(i));
                }
            }
            Booking myBooking  = new Booking(selectedSeats,selectedShow);
            System.out.println("Booking Successful");
        } else {
            System.out.println("Seat Already occupied");
        }
    }
    public static List<Theatre> getData() {
        Movie avengers = new Movie("Avengers",3);
        Movie bahubali = new Movie("Bahubali",3);
        Show show1 = new Show(1,avengers,10);
        Show show2 = new Show(2,bahubali,15);
        List<Show> shows = new ArrayList<>();
        shows.add(show1);
        shows.add(show2);
        List<Theatre> theatreList = new ArrayList<>();
        Theatre theatre1 = new Theatre(1,City.Bangalore,shows);
        Theatre theatre2 = new Theatre(2,City.Delhi,shows);
        theatreList.add(theatre1);
        theatreList.add(theatre2);
        return theatreList;
    }
}
