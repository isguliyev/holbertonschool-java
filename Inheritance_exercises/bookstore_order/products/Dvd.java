package products;

public class Dvd extends Product {
    private String director;
    private String genre;
    private int duration;

    public Dvd(
        String title,
        int year,
        String country,
        double grossPrice,
        String director,
        String genre,
        int duration) {
            super(title, year, country, grossPrice);
            setDirector(director);
            setGenre(genre);
            setDuration(duration);
    }

    @Override
    public double getNetPrice() {
        return getGrossPrice() * 1.2d;
    }

    public String getDirector() {
        return this.director;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}