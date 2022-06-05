package Streaming_service;

public class Movie extends Video {
    private int duration;

    public Movie(String name, String genre, int director, int duration) {
        super(name, genre, director);
        this.duration = duration;
    }
}
