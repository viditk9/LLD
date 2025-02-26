package src.LLDQuestions.BookMyShow;

import java.util.*;

public class BookMyShow {
    List<Theatre> theatreList;

    public static BookMyShow instance;

    BookMyShow() {
        theatreList = new ArrayList<>();
    }

    public static BookMyShow getInstance() {
        if(instance==null) {
            instance = new BookMyShow();
        }
        return instance;
    }

    public void setTheatreList(List<Theatre> theatreList) {
        this.theatreList = theatreList;
    }

    public List<Movie> getMoviesForCity(City city) {
        Set<Movie> set = new HashSet<>();
        for(Theatre theatre : theatreList) {
            for(Show show : theatre.getShows()) {
                set.add(show.movie);
            }
        }
        return set.stream().toList();
    }

    public List<Show> getShowsForMovieAndCity(Movie movie, City city) {
        List<Show> shows = new ArrayList<>();
        for(Theatre theatre : theatreList) {
            if(theatre.getCity()!=city) continue;
            for(Show show : theatre.getShows()) {
                if(show.getMovie()==movie) shows.add(show);
            }
        }
        return shows;
    }
}
