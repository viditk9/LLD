package src.LLDQuestions.BookMyShow;

public class Show {
    int id;
    Movie movie;
    int startTime;
    Screen screen;

    public Show(int id, Movie movie, int startTime) {
        this.id = id;
        this.movie = movie;
        this.startTime = startTime;
        this.screen = new Screen();
    }

    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getStartTime() {
        return startTime;
    }

    public Screen getScreen() {
        return screen;
    }
}
