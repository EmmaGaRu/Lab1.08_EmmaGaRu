package Streaming_service;

public abstract class Video {
    protected String name;
    protected String genre;
    protected int director;

    public Video(String name, String genre, int director) {
        this.name = name;
        this.genre = genre;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }
}
