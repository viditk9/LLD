package src.LLDQuestions.BookMyShow;

import java.util.List;

public class Theatre {
    int id;
    City city;
    List<Show> shows;

    public Theatre(int id, City city, List<Show> shows) {
        this.id = id;
        this.city = city;
        this.shows = shows;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
